fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person3("Sophia")
    val claudia = Person3("Claudia")
    sophia likes claudia                                       // 5
}

class Person3(val name: String) {
    val likedPeople = mutableListOf<Person3>()
    infix fun likes(other: Person3) { likedPeople.add(other) }  // 6
}