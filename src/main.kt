fun main(){
printName("Happiness")
    var result = module(5,4)
    println(result)
    var addition = sum(6, 7, 8, 9 )
    println(addition)
    printFun()
}
fun printName(name: String){
    println("Hello " + name)
}
fun module(num1: Int, num2: Int): Int{
    var  remainder = num1 % num2
    return  remainder
}
fun sum(a: Int, b: Int, c: Int, d: Int): Int{
   var add = a + b + c + d
    return add
}
fun printFun(){
    println("I know how to surf")
}