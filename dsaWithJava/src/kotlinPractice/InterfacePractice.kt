package kotlinPractice
/*
Interface (Pure Abstraction 🔥)

👉 Interface me mostly abstract functions hote hain*/

interface InterfacePractice {
    fun sound()
    fun eat()
}

class Animalll : InterfacePractice{
    override fun eat() {
        println("Eating")
    }

    override fun sound() {
        println("Sound")
    }
}

fun main(){
    val obj = Animalll()
    obj.eat()
    obj.sound()

}