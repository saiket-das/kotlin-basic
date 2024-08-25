fun main() {
    val arr = arrayOf("One", "Two", "Three");
    val arr2 = arrayOf<Int>(1, 2, 3);

    for ((i, e) in arr.withIndex()){
        println("$i: $e");
    }

    // access specific array index's value
    println(arr2[2])

    // set new value
    arr2.set(0, 10)
    println(arr2.get(0))

    // array size
    println(arr.size)
}