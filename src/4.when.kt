fun main() {
    var number = 19;
    var result = number in 1..5
    var result1 = number in 1 until 10;

    when (number) {
        in 0..9 -> println("Ones");
        in 1..<20 -> println("Tens");
        else -> println("Not in the range")
    }
}