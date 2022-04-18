package Scope

class User(
    var name: String = "ChidambaraBalaji",
    var age: Int = 24,
    var phone: Long = 8940284208
) {
    fun display(){
        println("\nName: $name\n" + "\nAge: $age\n" + "\nPhone: $phone\n")
    }
}