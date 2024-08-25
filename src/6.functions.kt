fun main() {
    println(sum(3, 2));
    evenOrOdd(5);
    printMessage();
    println(addition(1, 2));
    println(addition(a = 1.1, b = 3.2));

    // store function to a variable
    val fn = ::multiple;
    println(fn(10, 2));
}

// Inline function
fun sum(a: Int, b: Int) = a + b;

// Unit is a function that does not return any useful value
fun evenOrOdd(num: Int): Unit {
    if (num % 2 == 0) {
        println("Even");
    } else {
        println("Odd");
    }
}

// Default arguments
fun printMessage(count: Int = 2) {
    for (i in 1..count) {
        println("$i. Hello World!")
    }
}

/*
   (Function overloading) is a feature of object-oriented programming where two or more
   functions can have the same name but different parameters.
*/
fun addition(a: Int, b: Int): Int {
    return a + b;
}

fun addition(a: Double, b: Double): Double {
    return a + b;
}

fun multiple(a: Int, b: Int): Int {
    return a * b;
}

