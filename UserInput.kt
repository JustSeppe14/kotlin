fun main() {
    println("Please type your name and hit Enter.")
    // Write your code below
    val myName = readLine()
    println("Your name is $myName!")
}

/*
kotlinc UserInput.kt -include-runtime -d UserInput.jar
java -jar UserInput.jar
 */