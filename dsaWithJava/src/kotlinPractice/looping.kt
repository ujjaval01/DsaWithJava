package kotlinPractice

fun main(){

//    var table = 10
//
//    for (a in 1..10){
//        println(a)
////        println("$a * $table = ${a*table}")
//    }

    var i = 0;

//    while (i<5){
//        println(i)
//        i++
//    }

//    do{
//        println(i)
//        i++
//    }while (i<5)

    // when (switch case)

    val day = 5
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
//        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("Not found")
    }



}
