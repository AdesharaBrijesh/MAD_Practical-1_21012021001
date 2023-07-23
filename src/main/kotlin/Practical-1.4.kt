import java.util.Scanner
fun main() {
    println("MAD_Practical-1.4_21012021001")
    var reader = Scanner(System.`in`)
    println("enter the number : ")
    var x:Int = reader.nextInt()
    var ans:String = if(x.toInt() %2 == 0) "even" else "odd"
    println("$x is $ans")
}