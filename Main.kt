package Scope

fun main() {
    userDetalisLet()
    userDetalisRun()
    userDetalisWith()
    userDetalisApply()
    userDetalisAlso()
}

fun userDetalisLet() {
    var name: String? = null
    name?.let{
        println(it)
    }
    name = "kabilan"
    name?.let {
        println(name)
    }
}

fun userDetalisRun() {
    User().run {
        name = "Avani"
        phone = 9790435378
        return@run "The details of the user is ${display()}"
    }
}

fun userDetalisWith() {
    val user: Int = with(User()) {
        println(this.name)
        println(this.age)
        println(this.phone)
        age + 5
    }
    println("User age after five years $user")
}

fun userDetalisApply() {
    val user = User()
        user.apply {
        this.name = "Manoranjith"
        this.phone = 9842594208
        this.age = 21
    }
    with(user){
        println(name)
        println(phone)
        println(age)
    }
    user.also {
        it.name = "Azar"
        println("New Name: ${it.name}")
    }
}
fun userDetalisAlso() {
    val user = User()
        user.also { defaultUser ->
        println("The default user name is ${defaultUser.name}")
        defaultUser.name = "Aswin"
    }.run {
        "The Modified name is ${user.name}"
    }

    println(user)
}





