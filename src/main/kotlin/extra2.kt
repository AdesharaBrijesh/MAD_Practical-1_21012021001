fun main() {
    println(":")
    var p = Person("BRIJESH","21012021001")
    println(p.name)
    println(p)
}
open class Person(var name : String,var enrollment:String) {
    init {
        println("name is $name")
        println("enrollment is $enrollment")

    }
}