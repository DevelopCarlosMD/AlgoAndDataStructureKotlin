
class Greetings {
    fun welcomeUser(userName: String) {
        println("Welcome to the game: $userName")
    }
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val user = Greetings()
    user.welcomeUser("Poncho")
}