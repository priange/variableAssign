import java.util.Objects

fun main() {
    var fullName:String="Omara Emmanuel"
println("$fullName")
    var age:Int=18
    println("$age")
    var phoneNumber:String="0787303683"
    println("$phoneNumber")
    var weightInKg=67.8
    println("$weightInKg")
    var citizen:Boolean=false
    println("$citizen")

//operators
    val num1=20
    val num2=10
    var result1=num1+num2
    println(result1)
    var result2=num1*num2
    println(result2)
    var result3=num1-num2
    println(result3)
    var result4=num1/num2
    println(result4)
    var result5=num1%num2
    println(result5)

    //get strings together
    var excel="My mother is great"
    println("$excel")
    var excels="She loves me"
println("$excels")

//to identify or print the largest number in a string of numbers.
    var a=24
    var b=12
    val myString="""
        ${if (a > b) a else b}
        """
    println("Larger number is: ${myString.trimMargin()}")
//    peoplelist
//    var cathy =list of()
}
//Assignment 1: Variables and Data Types
//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
//Create variables and assign them some values for each of these fields.
//This assignment will be graded out of 10 points. Submit a github link.




