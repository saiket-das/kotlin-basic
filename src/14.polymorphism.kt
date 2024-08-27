fun main() {
    val circle: Shape = Circle(4.0);
    val square: Shape = Square(4.0);

    println(circle.area())
    println(square.area())

    var shapes = arrayOf(Circle(4.0), Circle(3.5), Square(8.0));
    calculateAreas(shapes);
}

fun calculateAreas (shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area());
    }
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return (Math.PI * radius * radius);
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return (side * side);
    }
}