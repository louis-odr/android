package com.example.montemirage.ui.theme.Pages.Products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.montemirage.ui.theme.MonteMirageTheme

@Composable
fun ViewProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "All products",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

    }
}


@Preview
@Composable
fun ViewProductsScreenPreview() {
    MonteMirageTheme {
        ViewProductsScreen(rememberNavController())
    }
}