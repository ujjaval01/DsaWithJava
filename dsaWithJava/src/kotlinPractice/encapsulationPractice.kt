package kotlinPractice

class Bank(){
    private var accountNo : Int = 0
    val name : String = "Ujjaval";

    fun setAccountNo(an : Int){
        accountNo = an;
    }

    fun getAccountNo() : Int{
        return accountNo;
    }
}

fun main(){
    val obj = Bank()
    obj.setAccountNo(123456)
    println(obj.getAccountNo())
}