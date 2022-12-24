
data class User(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // 2
}
fun main() {
    val user = User("Alex", 1)
    println(user)                                          // 3
    // out: User(name=Alex, id=1)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    // out: user == secondUser: true

    println("user == thirdUser: ${user == thirdUser}")
    // out: user == thirdUser: false

    // hashCode() function
    println(user.hashCode())                               // 5
    // out: 63347075

    println(secondUser.hashCode())
    // out: 63347075

    println(thirdUser.hashCode())
    // out: 2390846

    // copy() function
    println(user.copy())                                   // 6
    // out: User(name=Alex, id=1)

    println(user === user.copy())                          // 7
    // out: false

    println(user.copy("Max"))                        // 8
    // out: User(name=Max, id=1)

    println(user.copy(id = 3))                             // 9
    // out: User(name=Alex, id=3)

    println("name = ${user.component1()}")                 // 10
    // out: name = Alex

    println("id = ${user.component2()}")
    // out: id = 1
}