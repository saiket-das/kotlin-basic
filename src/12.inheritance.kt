fun main() {
    val vehicleObj = Vehicle();
    val truckObj = Truck();

    truckObj.method();
    truckObj.truckMethod();

}


open class Vehicle {
    var name: String = "";
    var model: String = "";
    var color: String = "";
    var isAutomatic: Boolean = false;

    fun method() {
        println("I am parent");
    }
}

class Truck : Vehicle() {
    fun truckMethod() {
        println("I am child");
    }
}