fun main() {

    var number1 = 0
    var number2 = 1
    var number3 = 0
    val numberUser = 34

    while (numberUser > number3) {
        number3 = number1 + number2
        number1 = number2
        number2 = number3
    }

    if (numberUser == 0) {
        println("O número 0 está na sequência de Fibonacci. \nO Próximo número é: 1")
    } else if (numberUser == number3) {
        println("O número informado $numberUser está na sequência de Fibonacci. \nO próximo número é: " + (number1 + numberUser))
    } else {
        println("Não faz parte da sequência de Fibonacci")
    }
}