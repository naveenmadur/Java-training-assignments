package Day6_AbstractAndInterface;


abstract class Shape {
    int dimensions;

    abstract void area();

    void displayShape(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Area of circle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}
