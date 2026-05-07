package kotlinPractice

/*
== → Same content?
👉 2 books me same story hai 📖📖 → TRUE
=== → Same physical book?
👉 dono ek hi copy hai ya alag?
*/

fun main(){
//    val a = "hello"
//    val b = "hello"
//
//    println(a == b)   // true ✅ (value same)

    val a = String("hello".toCharArray())
    val b = String("hello".toCharArray())

    println(a == b)    // true ✅ (same content)
    println(a === b)   // false ❌ (different objects in memory)
}