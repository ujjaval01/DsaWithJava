package kotlinPractice

open class Animal {

    fun eat(){
        println("Eating...")
    }
}

class Dog : Animal() {
    var name : String = "Dog"
    fun bark(){
        println("The $name barking")
    }
}

fun main(){
    val d = Dog()
    d.eat(); d.bark()

}

