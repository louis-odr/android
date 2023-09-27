package com.example.montemirage.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Montemirage.ui.theme.pages.Signup.SignupScreen
import com.example.montemirage.ui.theme.pages.Login.LoginScreen
import com.example.montemirage.ui.theme.pages.Products.AddProductsScreen
import com.example.montemirage.ui.theme.pages.Products.UpdateProductsScreen
import com.example.montemirage.ui.theme.pages.Products.ViewProductsScreen
import com.example.montemirage.ui.theme.pages.about.AboutScreen
import com.example.montemirage.ui.theme.pages.home.HomeScreen

@Composable
fun AppNavHost (modifier: Modifier = Modifier,
                       navController: NavHostController = rememberNavController(),
                       startDestination:String = ROUTE_HOME) {
    NavHost(
        navController = navController,
        modifier = modifier, startDestination = startDestination
    ) {

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }

        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCTS) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCTS) {
            ViewProductsScreen(navController)

        }
        composable(ROUTE_UPDATE_PRODUCTS + "/id") { passedData ->
            UpdateProductsScreen(navController, passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_PROFILE) {
            ViewProductsScreen(navController)


        }
    }
}
