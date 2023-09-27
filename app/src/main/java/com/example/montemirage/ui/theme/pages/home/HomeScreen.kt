package com.example.montemirage.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.montemirage.Navigation.ROUTE_ABOUT
import com.example.montemirage.Navigation.ROUTE_ADD_PRODUCTS
import com.example.montemirage.Navigation.ROUTE_LOGIN
import com.example.montemirage.Navigation.ROUTE_SIGNUP
import com.example.montemirage.Navigation.ROUTE_UPDATE_PRODUCTS
import com.example.montemirage.Navigation.ROUTE_VIEW_PRODUCTS
import com.example.montemirage.R
@Composable
fun HomeScreen(navController:NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.loui),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )



        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Text(
                text = "Home Screen",
                color = Color.Black,
                fontSize = 30.sp,
            )

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),

                ) {
                Text(
                    text = "Login",
                    fontFamily = FontFamily.Monospace
                )
            }

            Spacer(modifier = Modifier.height(20.dp))


            Button(
                onClick = {
                    navController.navigate(ROUTE_SIGNUP)
                },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
            ) {
                Text(text = "Signup")
            }

            Spacer(modifier = Modifier.height(20.dp))


            Button(
                onClick = { navController.navigate(ROUTE_ADD_PRODUCTS) },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),

                ) {
                Text(text = "Add products")
            }

            Spacer(modifier = Modifier.height(20.dp))


            Button(
                onClick = { navController.navigate(ROUTE_VIEW_PRODUCTS) },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),

                ) {
                Text(text = "View Products")
            }

            Spacer(modifier = Modifier.height(20.dp))


            Button(
                onClick = { navController.navigate(ROUTE_UPDATE_PRODUCTS) },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),

                ) {
                Text(text = "Update Products")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { navController.navigate(ROUTE_ABOUT) },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),

                ) {
                Text(text = "About")
            }


        }
    }
}
@Preview
@Composable
fun HomeScreenPreview() {

        HomeScreen(rememberNavController())
}