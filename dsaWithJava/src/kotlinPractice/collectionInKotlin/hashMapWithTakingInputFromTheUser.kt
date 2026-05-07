package kotlinPractice.collectionInKotlin

fun main(){

    val student = HashMap<Int, String>()

    print("Enter how many students is there : ")
    val s = readln().toInt()

    for (i in 1..s){
        print("Enter the student id : ")
        val id = readln().toInt()
        print("Enter the student name : ")
        val name = readln()

        student[id] = name
    }

    student.forEach {
        println("$it ")
    }


}