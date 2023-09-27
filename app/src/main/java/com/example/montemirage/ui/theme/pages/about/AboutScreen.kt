package com.example.montemirage.ui.theme.pages.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Montemirage.ui.theme.MonteMirageTheme
import com.example.montemirage.R

@Composable
fun AboutScreen(navController:NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.loui),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Spacer(modifier = Modifier.height(20.dp))



        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to about screen",
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "About App",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Monospace
            )
            Text(
                textAlign = TextAlign.Center,
                text ="->The objective of this app is to develop and launch a new line of sports products " + "that cater to the needs of athletes and sports enthusiasts",
                color = Color.White,

            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "The Creator",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.Monospace
            )

            Text(
                textAlign = TextAlign.Center,
                text = "->This application was created by Louis odera ",
                color = Color.White,
                )
        }
    }
}

@Preview
@Composable
fun AboutScreenPreview() {
    MonteMirageTheme{
        AboutScreen(rememberNavController())
    }
}