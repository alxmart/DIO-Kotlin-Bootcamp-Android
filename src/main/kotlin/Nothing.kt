data class Persona(val name: String?)

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun fail2(message: String) {
    throw IllegalArgumentException(message)
}

fun main() {
    val person = Persona("Ezequiel")
    val s = person.name ?: fail("Name required")
    println(s)
}