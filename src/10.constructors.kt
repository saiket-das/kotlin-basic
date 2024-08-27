fun main() {
    val personA = Human("A", 22);
    val personB = Human("B", 33);

//    println(personA.name);
//    println(personA.age);
//    println(personA.canVote );

    val tesla = AutoMobile("Tesla", "3");
    println(tesla.maxSeating);
}

class AutoMobile(val name: String, val model: String, val maxSeating: Int) {
    init {
        println("$name object is created!")
    }
    constructor(nameParam: String, modelParam: String) : this(nameParam, modelParam, maxSeating = 4)
    fun drive() {
        println("Car is on the road");
    }

    fun applyBreaks() {
        println("Applied break");
    }
}

class Human(nameParam: String, ageParam: Int) {
    val name: String = nameParam;
    val age: Int = ageParam;
    val canVote: Boolean = age > 18;
}