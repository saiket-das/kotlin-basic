fun main() {
    val tesla = Car(name = "Tesla model 3", type = "Electric", color = "Red");
    val bmw = Car(name = "BMW i7", type = "Electric", color = "Black");


    println(tesla.color);
    println(bmw.type);

    tesla.driveCar();
    tesla.applyBreaks();
}

// class
class Car (val name: String, val type: String, val color: String) {
     fun driveCar () {
         println("$name car is driving");
     }

    fun applyBreaks () {
        println("Applied break");
    }
}