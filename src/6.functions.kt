fun main() {
    println(sum(3, 2));
    evenOrOdd(5);
    printMessage();
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