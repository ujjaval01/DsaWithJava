package kotlinPractice

open class PolymorphismPractice {
    /*   compile time polymorphism
    fun add(a : Int, b : Int): Int{
        return a+b
    }
    fun add(a : Int, b : Int, c : Int): Int{
        return a+b+c
    } */

    // Run time polymorphism
    fun run(){
        println("Running...")
    }
}

class Ex : PolymorphismPractice(){
    fun walk(){
        println("Walking...")
    }
}

fun main(){
//    var res = PolymorphismPractice()
//    res.add(2,3)
//    res.add(4,5,6)

    var obj : PolymorphismPractice= Ex()
    obj.run()
//    obj.walk()
}