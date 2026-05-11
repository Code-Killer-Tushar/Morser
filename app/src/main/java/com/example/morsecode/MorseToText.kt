package com.example.morsecode


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.morsecode.ui.theme.Jonquil
import com.example.morsecode.ui.theme.MorseCodeTheme
import com.example.morsecode.ui.theme.RedViolet
import com.example.morsecode.ui.theme.RobinEggBlue

@Composable
fun MorseToText(navController: NavController) {
    fun morseToText(morse: String): String {
        val alphabets = AllMorses().alphabets


        val greeting = "Enter the Morse Code, so i can convert it into Text:-"
        println(greeting)
        val morseCode = morse
        var text = ""

        val wordsInMorse = morseCode.split("   ")

        for (words in wordsInMorse) {
            if (" " in words) {
                val letters = words.split(" ")
                for (morse in letters) {
                    for (alphabetsItems in alphabets) {
                        if (alphabetsItems[1] == morse.toString()) {
                            text = text + alphabetsItems[0]
                        }
                    }
                }
                text = "${text.capitalize()} "

            } else {
                for (alphabetsItems in alphabets) {
                    if (alphabetsItems[1] == words.toString()) {
                        text = text + alphabetsItems[0]
                    }
                }
                text = "${text.capitalize()} "
            }
        }
        return text
    }

    MorseCodeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            RobinEggBlue, Jonquil, RedViolet
                        )
                    ),
                    shape = RectangleShape
                )
        ) {
            var morse by remember {
                mutableStateOf("")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),

                ) {
                TextField(
                    value = morse,
                    onValueChange = { morse = it },
                    label = if (morse.isEmpty()) {
                        {
                            Text(
                                text = "Enter Morse Code...",
                                fontSize = 20.sp
                            )
                        }
                    } else null,
                    modifier = Modifier
                        .fillMaxWidth()
                )

                val text = morseToText(morse)

                Spacer(modifier = Modifier.height(50.dp))

                if (morse.isNotEmpty()) {
                    Text(
                        text = "Your Text is here:-",
                        fontSize = 25.sp

                    )
                    if (text.isNotEmpty()) {
                        TextField(
                            value = text,
                            onValueChange = {  }
                        )
                    }
                    Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        CopyButton(
                            textToCopy =  morseToText(morse), massage = "Copy text Here"
                        )
                    }
                }
            }
        }
    }
}

