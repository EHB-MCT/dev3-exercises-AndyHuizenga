class Duolingo(
    private var language: String = "NL",
    private var roundSize: Int = 2,
    private var level : String = "Easy"
) {
    private var words = mutableSetOf<Word>(
        FrenchWord("tapis", "tapijt"),
        FrenchWord("lampe", "lamp"),
        FrenchWord("fauteuil", "zetel"),
        DutchWord("kast", "armoire"),
        DutchWord("kussen", "coussin"),
        DutchWord("afstandbediening", "télécommande")
    )

    init {
        if (level == "Easy") {
//filter one language + 3 words
            language = arrayOf("FR", "NL").random()
            roundSize = 3
            words = words.filter { it.language == language }.toMutableSet()
        } else if (level == "Hard") {
            //no filter + 6 words
            roundSize = 6
        }
println(roundSize)
    }


    fun play() {
        val selectedWords = words.shuffled().take(roundSize).toMutableSet()

        while (selectedWords.isNotEmpty()) {
            val randomWord = selectedWords.random()
            if (randomWord.language == "FR") {
                val toTranslateTO = "NL"
            } else if (randomWord.language == "NL") {
                val toTranslateTO = "FR"

                println("Please translate: ${randomWord.original} to $toTranslateTO")
                val userAnswer = readLine()
                if (userAnswer == randomWord.translated) {
                    println("Right answer")
                    selectedWords.remove(randomWord)
                } else {

                    println(randomWord.translated)
                }

                println("You still have ${selectedWords.count()} words to translate.")
            }

        }
        println("Good job, you translated all the words")
    }
}






