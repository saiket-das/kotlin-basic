fun main() {

    // for loop
    val number = 2
    for (i in 1..10) {
        println("$number * $i = ${number * i}");
    }

    // for loop with step (i+=2)
    println("Until");
    for (i in 1..5 step 2) {
        println(i);
    }

    // for loop with downTo (i--)
    println("Down to");
    for (i in 10 downTo 1 step 2) {
        println(i);
    }

    // while loop
    println("While");
    var count = 1;
    while (count <= 5) {
        println("$count. Hello World!");
        count++;
    }

    // do-while loop
    var check = 1;
    do {
        println("Execute first. Then check the condition");
        check++;
    } while (check < 3)
}