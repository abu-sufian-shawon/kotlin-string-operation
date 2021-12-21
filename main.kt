import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)
    print("Put your article: ")
    val article = scn.nextLine()

    val word = wordCount(article)
    println("Total $word words in your article")
}