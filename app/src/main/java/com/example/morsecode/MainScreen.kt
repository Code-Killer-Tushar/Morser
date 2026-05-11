package com.example.morsecode


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.morsecode.ui.theme.MorseCodeTheme
import com.example.morsecode.ui.theme.TropicalIndigo

@Composable
fun MainScreen(navController: NavController) {


    MorseCodeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Cyan, Color.Magenta)
                    )
                )

                .padding(10.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Magenta, Color.Cyan)
                    ),
                    shape = CircleShape
                )


        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Welcome to Morser",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp, bottom = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {



                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            navController.navigate("TextToMorse")
                        },
                        modifier = Modifier
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = TropicalIndigo,
                            contentColor = Color.White
                        )


                    ) {
                        Text(
                            text = "Text to Morse",
                            fontSize = 20.sp,
                            fontWeight = Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        onClick = {
                            navController.navigate("MorseToText")
                        },
                        modifier = Modifier.height(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = TropicalIndigo,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Morse to Text",
                            fontSize= 20.sp,
                            fontWeight = Bold
                        )
                    }
                }
            }


        }

    }
}