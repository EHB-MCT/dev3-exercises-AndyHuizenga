import kotlin.random.Random

fun main(){
    println("Challenge 1: Guess the killer in Games of Thrones! ")
    questionOne()

}

fun questionOne(){
    println("Who killed Khalisee in the last episode?")

    val correctAnswer = "John Snow"
    val userAnswer = readLine()

    if (correctAnswer.contains(userAnswer.toString())) {
        println("You are right")
        println("Challenge 1: Try out your luck out and guess the number!")
        questionTwo()
    } else {
        println("Game over")
    }
}

fun questionTwo(){
    println("Chose between low (1-3) or high (4-6)")
    val userChoise = readLine()
    val dicenumber = (1..6).random()
    println(dicenumber)
    val lowNumber : IntArray = intArrayOf(1,2,3)
    val highNumber : IntArray = intArrayOf(4,5,6)

    when (userChoise) {
        "low" -> if (lowNumber.contains(dicenumber)) {
            println("You won challenge 2")
        } else {println("Game over")}
        "high"-> if (highNumber.contains(dicenumber)) {
            println("you won challenge 2")
        } else {println("Game over")}

        }
    }

