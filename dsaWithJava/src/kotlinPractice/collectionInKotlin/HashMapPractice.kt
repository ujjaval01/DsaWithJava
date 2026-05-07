package kotlinPractice.collectionInKotlin

fun main() {

    val students = HashMap<Int, String>()

    students[1] = "Rahul"
    students[2] = "Aman"
    students[3] = "Bhai"

    println(students)

    println(students[2])

    students.remove(1)

    println(students)

    for((id, name) in students) {
        println("$id -> $name")
    }
}