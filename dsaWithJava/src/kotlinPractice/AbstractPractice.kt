package kotlinPractice

/*
1. Abstract Class
👉 Abstract class ka object nahi bana sakte
👉 Isme abstract (no body) + normal functions dono ho sakte hain*/

abstract class AbstractPractice {

    abstract fun cat()   // abstract function

    fun dog(){         // Non-abstract function
        println("bark...")
    }
}

class Animall : AbstractPractice(){
    override fun cat() {
        println("Meow...")
    }
}

fun main(){
    val obj = Animall()
    obj.cat()
    obj.dog()
}