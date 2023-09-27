package com.example.montemirage.ui.theme.pages.Products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Montemirage.ui.theme.MonteMirageTheme
import com.example.montemirage.R

@Composable
fun Profile(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()){

        Image(
            painter =PainterResource(id= R.drawable.background) ,
            contentDescription ="Background",
            contentScale = ContentScale.FillBounds,
            Modifier = Modifier.matchParentSize()
        )
    }

}
@Preview
@Composable
fun ProfilePreview() {
    MonteMirageTheme {
        ProfilePreview(rememberNavController())
    }
}