import kotlinoop.kotlinoop11.Dog
import kotlinoop.kotlinoop11.Person

fun main(){


    val person1=Person()
    person1.setName("Mary")
    println("My name is ${person1.getName()}")
    person1.breath()
    person1.walk()

    val dog1 =Dog()
    dog1.walk()
}