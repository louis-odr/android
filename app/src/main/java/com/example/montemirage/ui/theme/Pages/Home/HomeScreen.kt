package com.example.montemirage.ui.theme.Pages.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.montemirage.Navigation.ROUTE_ADD_PRODUCTS
import com.example.montemirage.Navigation.ROUTE_LOGIN
import com.example.montemirage.Navigation.ROUTE_UPDATE_PRODUCTS
import com.example.montemirage.Navigation.ROUTE_VIEW_PRODUCTS
import com.example.montemirage.ui.theme.MonteMirageTheme

@Composable
fun HomeScreen(navController:NavHostController) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Welcome to home screen",
            color = Color.Magenta
        )
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }) {
            Text(text = "Login")
        }


        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCTS)
        }) {
            Text(text = "Add products")
        }

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCTS)
        }) {
            Text(text="View products")
        }

        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_PRODUCTS)
        }) {
            Text(text="update products")
        }

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    MonteMirageTheme{
        HomeScreen(rememberNavController())
    }
}