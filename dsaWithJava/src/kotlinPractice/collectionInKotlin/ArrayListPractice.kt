package kotlinPractice.collectionInKotlin

fun main() {

    val list = ArrayList<String>()

    list.add("Java")
    list.add("Kotlin")
    list.add("Android")

    println(list)

    list.remove("Java")

    println(list)

    println(list[0])
}