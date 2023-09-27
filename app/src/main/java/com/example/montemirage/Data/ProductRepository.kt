package com.example.montemirage.Data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.montemirage.Navigation.ROUTE_LOGIN
import com.example.montemirage.models.Products
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ProductRepository (navController: NavHostController, var context: Context) {
    var authRepository: AuthRepository
    var progress: ProgressDialog
    var products: ArrayList<Products>

    init {
        authRepository = AuthRepository(navController, context)
        if (!authRepository.isloggedin()) {
            navController.navigate(ROUTE_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
        products = mutableListOf<Products>() as ArrayList<Products>
    }

    fun saveProduct(name: String, quantity: String, price: String) {
        var id = System.currentTimeMillis().toString()
        var productData = Products(name, quantity, price, id)
        var productRef = FirebaseDatabase.getInstance().getReference()
            .child("products/$id")
        progress.show()
        productRef.setValue(productData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    fun viewProducts(): ArrayList<Products> {
        var ref = FirebaseDatabase.getInstance().getReference().child("Products")
        progress.show()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                progress.dismiss()
                products.clear()
                for (snap in snapshot.children) {
                    var product = snap.getValue(Products::class.java)
                    products.add(product!!)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                progress.dismiss()
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })
        return products

    }

    fun deleteProducts(id: String) {
        var delRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        progress.show()
        delRef.removeValue().addOnCompleteListener() {


            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Product deleted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun updateProducts(name: String, quantity: String,price: String,id: String){
        var updateRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")

        var productData = Products(name,quantity,price,id)
        progress.show()
        updateRef.setValue(productData).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context,it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }

    }
}

