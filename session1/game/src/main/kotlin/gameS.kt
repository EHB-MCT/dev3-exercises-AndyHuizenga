import kotlin.random.Random

val chosenWeapon = arrayOf("rock","scissors","paper")

val pcWeapon = chosenWeapon [(Random.nextInt(0,3))]

fun show(){
    println(pcWeapon)
}
