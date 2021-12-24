import java.util.Scanner

/**
 * length >= 8, score = 20
 * uppercase, score = 20
 * digit, score = 20
 * special character = 20
 */

fun hasLowerCase(str: String): Boolean {
    for (c in str) {
        if (c in 'a'..'z') return true
    }

    return false
}

fun hasUpperCase(str: String): Boolean {
    for (c in str) {
        if (c in 'A'..'Z') return true
    }
    return false
}

fun hasDigit(str: String): Boolean {
    for (d in str) {
        if (d in '0'..'9') return true
    }
    return false
}


fun hasSpecialCharacter(str: String): Boolean {
    for (s in str) {
        if (!hasLowerCase(s.toString()) &&
            !hasUpperCase(s.toString()) &&
            !hasDigit(s.toString())
        ) {
            return true
        }
    }
    return false
}

fun passwordStrength(password: String): Int {
    var score = 0

    if (password.length >= 8){
        score += 20

        if (hasLowerCase(password)) score += 20

        if (hasUpperCase(password)) score += 20

        if (hasDigit(password)) score += 20

        if (hasSpecialCharacter(password)) score += 20
    }

    return score
}


fun main() {

    val password = "aABCDEFGHha"

    val score = passwordStrength(password)

    println(score)

//    val scn = Scanner(System.`in`)
//    val str = scn.nextLine()
//
//    for(c in str) print(toUpperCase(c))

/*    val scn = Scanner(System.`in`)
    print("Put your article: ")
    val article = scn.nextLine()

    val word = wordCount(article)
    println("Total $word words in your article")*/
}