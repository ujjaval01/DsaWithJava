package kotlinPractice.collectionInKotlin

fun main(){
    val list = mutableListOf(0,1,2,3,4,5,6)

   /* list.size
    list.add(5)
    list.remove(2)
    list.removeFirst()...............  aur bhi bhot saare methods h
    */

//    for(item in list){
//        println(item*2)
//    }

    var res = list
        .map { it * it }
        .filter { it %2 != 0 }
        .reversed()

    println(res)
}