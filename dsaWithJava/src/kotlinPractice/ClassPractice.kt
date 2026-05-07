package kotlinPractice

class ClassPractice {
    var name: String
    var age: Int



    constructor(name: String, age: Int){
        this.age = age;
        this.name = name
    }



    fun printInfo(){
        println("$name your age is $age")
    }
}

//class Person(val name: String, val age: Int)    // Primary constructor

fun main(){
//    val  cp = Person("Ujvl", 24)
//    println("${cp.name} ${cp.age}")

    val cp = ClassPractice("Ujvl", 24)
    cp.printInfo()
}