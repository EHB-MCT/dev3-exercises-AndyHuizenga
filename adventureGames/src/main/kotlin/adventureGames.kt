fun main(){
    println("Game of Thrones: Guess the killer! ")
    questionOne()
}

fun questionOne(){
    println("Who killed Khalisee in the last episode?")

    val correctAnswer = "John Snow"
    val userAnswer = readLine()

    if (correctAnswer.contains(userAnswer.toString())) {
        println("You are right")
    } else {
        println("You lost")
    }
}