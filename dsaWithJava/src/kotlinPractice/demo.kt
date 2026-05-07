package kotlinPractice

data class Userr(
    var name: String = "",
    var age: Int = 0
)

fun main() {

    val user = Userr().apply {

        name = "Bhai"
        age = 20
    }

//    user.age = 50
//    user.name = "saini"

//    println(user)

    val str : String? = "saini"
    val res = str.let { 
        println(it?.uppercase())
        it?.length
    }

    println(res)


}