
fun someCondition() = false

fun main() {

    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3
    println(b)
    println(c)

    var e: Int
    // println(e)  // -> Variable e must be initialize
    e = 10
    println(e)

    val d: Int  // 1

    if (someCondition()) {
    //if (e > 5) {
        d = 150   // 2
    } else {
        d = 200   // 2
    }
    println(d) // 3


}