# importing random...
import kotlin.random.Random

# def function 
fun main() {
    # you can change len of password from "generatePassword(int)"
    # int =9,58 568 - whatever you want xD
    val password = generatePassword()
    println("Generated Password: $password")
}
# generating password! 
fun generatePassword(length: Int): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+"
    val password = StringBuilder(length)
    repeat(length) {
        password.append(chars[Random.nextInt(chars.length)])
    }
    # returning value!
    return password.toString()
}
