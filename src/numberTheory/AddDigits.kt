package number_theory

class AddDigits {
    val caller = Thread.currentThread().stackTrace[2]

    fun addDigits(num: Int) : Int{
        if(num < 10){
            return num
        }
        var inputNum = num
        var sumOfLastNumber = 0

        var lastNumber = 0
        var withoutLastNumber = 0

        while (inputNum >= 9){
            lastNumber = inputNum % 10
            withoutLastNumber = inputNum - lastNumber
            inputNum = (withoutLastNumber / 10)
            sumOfLastNumber += lastNumber
        }
        val totalSumDigits = sumOfLastNumber + inputNum
        if (totalSumDigits >= 9){
           return addDigits(sumOfLastNumber + inputNum)
        }
        return totalSumDigits
    }

    fun testDigits(num: Int,expectedValue : Int){
        val test = addDigits(num)
        if(test == expectedValue){
            println("${caller.lineNumber} ${test} || ${expectedValue} true ")
        }else{
            println("${caller.lineNumber} ${test} || ${expectedValue} false")
        }
    }

}

fun main() {
    val test = AddDigits()

    val test_1 = test.testDigits(19,1)
    val test_2 = test.testDigits(259,7)
    val test_3 = test.testDigits(1172,2)

}