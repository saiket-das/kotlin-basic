fun main() {
    val onePlus = OnePlus("One Plus");
    onePlus.display();
    println(onePlus.color);
    println(onePlus.toString());
}

open class Mobile(nameParam: String) {
    open var name: String = nameParam;
    open var model: String = "";
    open var brand: String = "";
    open var color: String = "";

    fun makeCall() {
        println("Mobile make call")
    }
    fun powerOff() {
        println("Mobile power off")
    }
    fun powerOn() {
        println("Mobile power on")
    }
    open fun display() {
        println("Mobile display")
    }
}

class OnePlus(nameParam: String): Mobile(nameParam) {
    // Override parent method
    override var name = nameParam;
    override var color = "Black";
    override fun display() {
        super.display();    // Call parent display method
        println("OnePlus display")
    }

    // Override toString method
    override fun toString(): String {
        return "OnePlus(name='$name', color='$color')"
    }

}