package kotlinPractice

fun main(){
    print("Enter your name : ")
    val name = readlnOrNull() ?: "Unknown"
    print("Enter your age : ")
    val age = readlnOrNull()?.toInt() ?: 0
    println("hello $name u are $age year old")
}