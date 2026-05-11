package com.example.morsecode

class AllMorses {
    // Letters
    val a = listOf("a", ".-")
    val b = listOf("b", "-...")
    val c = listOf("c", "-.-.")
    val d = listOf("d", "-..")
    val e = listOf("e", ".")
    val f = listOf("f", "..-.")
    val g = listOf("g", "--.")
    val h = listOf("h", "....")
    val i = listOf("i", "..")
    val j = listOf("j", ".---")
    val k = listOf("k", "-.-")
    val l = listOf("l", ".-..")
    val m = listOf("m", "--")
    val n = listOf("n", "-.")
    val o = listOf("o", "---")
    val p = listOf("p", ".--.")
    val q = listOf("q", "--.-")
    val r = listOf("r", ".-.")
    val s = listOf("s", "...")
    val t = listOf("t", "-")
    val u = listOf("u", "..-")
    val v = listOf("v", "...-")
    val w = listOf("w", ".--")
    val x = listOf("x", "-..-")
    val y = listOf("y", "-.--")
    val z = listOf("z", "--..")
    val space = listOf(" ", " ")


    // Punctuation
    val period = listOf(".", ".-.-.-")       // .
    val comma = listOf(",", "--..--")        // ,
    val question = listOf("?", "..--..")     // ?
    val apostrophe = listOf("'", ".----.")   // '
    val exclamation = listOf("!", "-.-.--")  // !
    val slash = listOf("/", "-..-.")          // /
    val parenOpen = listOf("(", "-.--.")      // (
    val parenClose = listOf(")", "-.--.-")   // )
    val ampersand = listOf("&", ".-...")      // &
    val colon = listOf(":", "---...")        // :
    val semicolon = listOf(";", "-.-.-.")    // ;
    val equals = listOf("=", "-...-")         // =
    val plus = listOf("+", ".-.-.")           // +
    val minus = listOf("-", "-....-")        // -
    val underscore = listOf("_", "..--.-")   // _
    val quote = listOf("\"", ".-..-.")       // "
    val dollar = listOf("$", "...-..-")     // $
    val at = listOf("@", ".--.-.")           // @
    // @

    // Numbers
    val zero = listOf("0", "-----")
    val one = listOf("1", ".----")
    val two = listOf("2", "..---")
    val three = listOf("3", "...--")
    val four = listOf("4", "....-")
    val five = listOf("5", ".....")
    val six = listOf("6", "-....")
    val seven = listOf("7", "--...")
    val eight = listOf("8", "---..")
    val nine = listOf("9", "----.")


    val alphabets = listOf(
        a, b, c, d, e, f, g, h, i, j,
        k, l, m, n, o, p, q, r, s, t,
        u, v, w, x, y, z, space,


        period, comma, question, apostrophe, exclamation,
        slash, parenOpen, parenClose, ampersand, colon,
        semicolon, equals, plus, minus, underscore,
        quote, dollar, at,

        zero, one, two, three, four,
        five, six, seven, eight, nine
    )

    val specialPunctuations = listOf(".", "!", "?")
}