package kotlinPractice

class Box<T>(val value : T)

class Data<K, V>(
    val id: K,
    val name: V
)

fun main() {

    val intBox = Box(10)

    val stringBox = Box("saini")

    println(intBox.value)

    println(stringBox.value)

    val user1 = Data(1, "Ujvl")
    val user2 = Data(2, "Aman")

    println("Id = ${user1.id}, Name = ${user1.name}")
    println("Id = ${user2.id}, Name = ${user2.name}")


}