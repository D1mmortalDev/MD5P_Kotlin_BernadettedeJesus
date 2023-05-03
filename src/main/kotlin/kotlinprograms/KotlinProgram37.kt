fun main(){

    var number1:Int=0
    var number2:Int=0

    try{
        println("****************************")
        println("Simple Calculator")
        println("****************************")
        println("Enter number 1:")
        number1 = readln().toInt()
        println("Enter number 2:")
        number2 = readln().toInt()
        println("The quotient is ${number1/number2}")
    }catch (exception:NumberFormatException){
        println("NumberFormatException")
        println("Wrong Input, Integer inputs only!")
    } catch (exception:ArithmeticException){
        println("ArithmeticException")
        println("Wrong Input, Integer inputs only!")
    }finally {
        println("This all always executes")
    }
    println("This is a test")
}