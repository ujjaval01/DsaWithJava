package kotlinPractice

fun main(){
//    greet()
//    greet("ujjaval")

    println(add(2,4))
}

fun greet(name : String = "sir") : Unit{
    println("Hello $name")
}

// with return value
fun add(a : Int, b : Int) : Int{
    return a + b
}