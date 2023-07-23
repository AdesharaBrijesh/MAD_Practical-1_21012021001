fun main(){
    println("MAD_Practical-1.8_21012021001")

    println("Array created by using arrayof() method")
    var a1 = arrayOf(13,33,25,43,38)
    println(a1.contentToString())

    println("Array created by using Array<>  method")
    var a2 = Array(5){0}
    println(a2.contentDeepToString())

    println("Array created by using Array<> and Lambda function")
    var a3 = Array(7){i->i}
    println(a3.contentToString())

    println("Array created using IntArray()")
    var a4 = IntArray(5){7}
    println(a4.joinToString (", "))

    println("Array created using IntArrayOf()")
    var a5 = intArrayOf(12,24,36,47,52)
    println(a5.joinToString(", "))

    println("Array created by using arrayof() and intArrayOf()")
    var a6 = arrayOf(intArrayOf(5,3), intArrayOf(4,1), intArrayOf(6,2))
    println(a6.contentDeepToString())

    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val user = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        user[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(user.contentToString())

}