package Day6_AbstractAndInterface;

public interface ShapeNew {
    int dimension = 0;
    void area();

    default void display(){
        System.out.println("Default method");
    }

    static void getArea(){
        System.out.println("Static method");
    }

}
