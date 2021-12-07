class Duolingo(
    private val language: String = "FR",
    private val roundSize: Int = 5)

{
    private var words = mutableSetOf<Word> (
        FrenchWord("tapis", "tapijt"),
        FrenchWord("lampe", "lamp"),
        FrenchWord("fauteuil", "zetel"),
        DutchWord("kast", "armoire"),
        DutchWord("pillow", "coussin"),
        DutchWord("remote", "télécommande")
        )

    init {
       words = words.filter {  it.language == language }.toMutableSet()
    }
    fun play() {
        val selectedWords =  words.shuffled().take(roundSize).toMutableSet()


       while (selectedWords.count() > 0) {
       val selectedWord = selectedWords.random()
       println(selectedWord.original)
       val userAnswer = readLine()
       if (userAnswer == selectedWord.translated) {

           selectedWords.remove(selectedWord)
       } else {

           println(selectedWord.translated)
       }

       println(selectedWords.count())
   }
        println("Good job, you translated all the words")
    }

}
