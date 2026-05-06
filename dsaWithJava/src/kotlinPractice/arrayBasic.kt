package kotlinPractice

fun main(){
    var arr = arrayOf(1,2,3,4,5)
//    var arr = intArrayOf(1,2,3,4,5)
//    var arr : Array<Int> = arrayOf(1,2,3,4,5)

//    val arr = arrayOf('a', 'b', 'c')   // generic array

//    val arr = Array(5) { it * 2}   // lambda array

//    arr[0] = 9

//    for (ele in arr){
//        print("$ele ")
//    }

    val sub = arr.copyOf()

    println(arr.indices)

    sub.forEach {
        print("$it ")
    }

}