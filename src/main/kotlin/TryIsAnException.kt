fun main() {
    val a = 10
    val b = 0

    val divisao  = try {
    println("Tentando fazer a divisão...")
     a/b
    }  catch (e: ArithmeticException) {
        println("Divisão com erro")
        null
    } finally {
        println("Finally executado !")
    }
    println("divisao = $divisao")

}