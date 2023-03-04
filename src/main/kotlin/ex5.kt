fun main() {

    val palavra = "programador"
    val reverse = reverse(palavra)
    println(reverse)

}

fun reverse(palavra: String): String {
    val str = CharArray(palavra.length)
    palavra.indices.forEach { str[palavra.length - it - 1] = palavra[it] }
    return String(str)
}