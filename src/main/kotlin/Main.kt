fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var sumNum = sum(4, 5);
    println(sumNum);
    val firstName = "Corey"

}

fun sum(a: Int, b: Int): Int {
    return a + b
}