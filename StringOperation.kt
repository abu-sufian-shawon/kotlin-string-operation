fun firstCharIndex(str: String): Int {
    var firstCharPos = 0
    while (str[firstCharPos] == ' ') {
        firstCharPos++
    }
    return firstCharPos
}

fun lastCharIndex(str: String): Int {
    var lastCharPosition = str.length - 1
    while (str[lastCharPosition] == ' ') {
        lastCharPosition--
    }
    return lastCharPosition
}

fun trimSpace(str: String): String {
    var newStr = ""
    val firstCharPos = firstCharIndex(str)
    val lastCharPos = lastCharIndex(str)
    return if (str[0] == ' ') {
        for (i in firstCharPos..lastCharPos) {
            newStr += str[i].toString()
        }
        newStr
    } else {
        str
    }
}

fun wordCount(str: String): Int {

    val afterTrim = trimSpace(str)

    var counter = 0

    var preSpace = false
    for (char in afterTrim) {
        preSpace = if (char == ' ') {
            if (!preSpace) counter++
            true
        } else {
            false
        }
    }

    counter++
    return counter
}

fun titleCase(str:String):String {
    val safia = str.toCharArray()

    // without condition
    safia[0] = safia[0].toUpperCase()

    for(i in safia.indices){
        if(safia[i] == ' '){
            safia[i + 1] = safia[i + 1].toUpperCase()
        }
    }
    return safia.concatToString()
}

fun toUpperCase(c: Char): Char {
    return if (c in 'a'..'z') c - 32 else c
}

fun toLowerCase(c: Char): Char {
    return if (c in 'A'..'Z') c + 32 else c
}