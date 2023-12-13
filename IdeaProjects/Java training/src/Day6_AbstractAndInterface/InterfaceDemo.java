package Day6_AbstractAndInterface;

class Rectangle implements ShapeNew{

    @Override
    public void area() {
        System.out.println("Area of rect");
    }
}

class Triangle implements ShapeNew{

    @Override
    public void area() {
        System.out.println("Area of triangle");
    }

    @Override
    public void display() {
//        ShapeNew.super.display();
        System.out.println("Display triangle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ShapeNew shapeNew;
        shapeNew = new Rectangle();
        shapeNew.area();
        shapeNew.display();
        shapeNew = new Triangle();
        shapeNew.area();
        shapeNew.display();
        ShapeNew.getArea();
    }
}
