import java.util.Scanner

fun trimSpace(str: String): String {
    var newStr = ""

    var firstCharPos = 0
    while (str[firstCharPos] == ' ') {
        firstCharPos++
    }

    return if (str[0] == ' ') {
        for (i in firstCharPos until str.length) {
            newStr += str[i].toString()
        }
        newStr
    } else {
        str
    }
}

fun wordCount(str: String): Int {
    var counter = 0

    var preSpace = false
    for (char in str) {
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

fun main() {
    val scn = Scanner(System.`in`)
    print("Put your article: ")
    val article = scn.nextLine()

    val afterTrim = trimSpace(article)

    println("After count : $afterTrim")

    val word = wordCount(afterTrim)
    println("Total $word words in your article")
}