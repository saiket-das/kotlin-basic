fun main() {
    val john = Person("John Smith", 17);
    val noor = Person("Md Noor", 22);

    println(john.canVote());
    println(noor.canVote());
}

class Person(val name: String, var age: Int) {
    fun canVote(): Boolean {
        return age > 18;
    }
}