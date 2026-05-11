package com.example.morsecode


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.sp
import com.example.morsecode.ui.theme.Jonquil
import com.example.morsecode.ui.theme.MorseCodeTheme
import com.example.morsecode.ui.theme.RedViolet
import com.example.morsecode.ui.theme.RobinEggBlue
import java.util.Locale
import kotlin.text.iterator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun TextToMorse(navController: NavController) {
    fun textToMorse(morse: String): String {
        val alphabets = AllMorses().alphabets


        //val greeting = "Enter the Text, so i can convert it into Morse Code:-"
        //println(greeting)
        val normalText = morse
        val lowerCaseText = normalText.lowercase(Locale.getDefault())
        var morseCode = ""

        for (letters in lowerCaseText) {
            for (alphabetItems in alphabets) {
                if (alphabetItems[0] == letters.toString()) {
                    morseCode = morseCode + alphabetItems[1] + " "
                }
            }
        }
        morseCode = morseCode.dropLast(1)
        //println("So, your morse code is here:-\n'$morseCode'")
        return morseCode

    }
    MorseCodeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            RedViolet, Jonquil, RobinEggBlue
                        )
                    ),
                    shape = RectangleShape
                )
        ) {

            var text by remember {
                mutableStateOf("")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),

                ) {
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = if (text.isEmpty()) {
                        {
                            Text(
                                text = "Enter Text...",
                                fontSize = 20.sp
                            )
                        }
                    } else null,
                    modifier = Modifier
                        .fillMaxWidth()
                )

                val morse = textToMorse(text)

                Spacer(modifier = Modifier.height(50.dp))

                if (text.isNotEmpty()) {
                    Text(
                        text = "Your Morse Code is here:-",
                        fontSize = 25.sp

                    )
                }
                if (morse.isNotEmpty()) {
                    TextField(
                        value = morse,
                        onValueChange = {  }
                    )
                }
                Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    CopyButton(
                        textToCopy =  textToMorse(text), massage = "Copy Morse Here"
                    )
                }




            }


        }
    }
}
