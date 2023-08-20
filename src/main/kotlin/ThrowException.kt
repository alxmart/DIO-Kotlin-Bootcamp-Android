import kotlin.jvm.Throws

class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(nome: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("Apenas pessoas c/ 16 anos ou + podem votar")
    }
    println("Voto do $nome  realizado com sucesso")
}

fun main() {

    vote("Homer", 48)
    vote("Lisa", 10)



}