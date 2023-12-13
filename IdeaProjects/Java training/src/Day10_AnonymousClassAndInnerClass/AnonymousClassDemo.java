package Day10_AnonymousClassAndInnerClass;

abstract class Shape{
    int dimensions;

    public void display(){}

    public abstract  void area();
}

abstract  class Circle extends  Shape{
    public abstract void demo();

    public void demo2(){
        System.out.println("Demo 2");
    }

}

public class AnonymousClassDemo {
    public static void main(String[] args) {

        // Anonymous class
        Circle circle = new Circle() {
            @Override
            public void demo() {

            }

            @Override
            public void area() {

            }
        };
        circle.dimensions = 10;
        circle.area();
        circle.demo();
        circle.demo2();
    }
}
