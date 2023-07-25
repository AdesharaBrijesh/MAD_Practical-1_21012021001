fun main() {
    println("main function")
    var s = Student("BRIJESH","21012021001")
        println(s.name)
        println(s)
}

class Student(var name : String,var enrollment:String) {
    init {
        println("name is $name")
        println("enrollment is $enrollment")

    }
    override fun toString(): String {
        return super.toString()
    }
}
