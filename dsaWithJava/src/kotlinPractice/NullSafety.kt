package kotlinPractice
/*
Operator	  Meaning
?	        nullable type
?.	        safe call
?:	        default value
!!	        force non-null
let	        null-safe block*/
fun main() {

    var name: String? = null

    println(name?.length)

    val result = name ?: "Guest"

    println(result)

    name = "Kotlin"

    name?.let {
        println(it.uppercase())
    }
}