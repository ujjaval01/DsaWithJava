package kotlinPractice

enum class TrafficLight{
    RED,
    YELLOW,
    GREEN
}

fun main(){

    print("Enter the Signal Color : ")
    val input = readln()?.uppercase()
    val signal = TrafficLight.valueOf(value = input ?: "RED")


    when(signal){

        TrafficLight.RED ->{
            println("Stop.")
        }
        TrafficLight.YELLOW ->{
            println("Ready.")
        }
        TrafficLight.GREEN ->{
            println("Go.")
        }

    }
}