package com.example.montemirage.ui.theme.pages.Products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Montemirage.ui.theme.MonteMirageTheme
import com.example.montemirage.Data.ProductRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        Text(
            text = "Add product",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold)

        var productname by remember { mutableStateOf(TextFieldValue("")) }
        var productquantity by remember { mutableStateOf(TextFieldValue("")) }
        var productprice by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(value = productname,
            onValueChange ={productname = it},
            label = { Text(text = "Productname") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = productquantity,
            onValueChange ={productquantity = it},
            label = { Text(text = "productquantity") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = productprice,
            onValueChange ={productprice = it},
            label = { Text(text = "Productprice") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {

            //-------WRITE SAVE LOGIC HERE----- //
            var productsRepository = ProductRepository(navController,context)
            productsRepository.saveProduct(productname.text.trim(),productquantity.text.trim(),productprice.text.trim())

        }) {
            Text(text = "Save")
        }



    }

    }

@Preview
@Composable
fun AddProductsScreenPreview() {
    MonteMirageTheme {
        AddProductsScreen(rememberNavController())
    }
}
