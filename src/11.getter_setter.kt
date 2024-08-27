fun main() {
    val first = Calculator();
    println(first.addition(5, 6));

    val person1 = PersonObj("John", 25);
    println(person1.name)
    person1.age = -21
}

class PersonObj(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
        return field.toUpperCase();
        }
    var age = ageParam
        set(value) {
            if (value > 0) {
                field = value;
            } else {
                println("Age can't be negative value")
            }
        }
}

// A default constructor is provided by compiler itself. An empty no argument constructor
class Calculator {

    lateinit var message: String;
    fun addition(a: Int, b: Int): Int {
        return a + b;
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b;
    }
}