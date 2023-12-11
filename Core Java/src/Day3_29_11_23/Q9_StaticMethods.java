package Day3_29_11_23;

abstract class DemoClass{

    // We can overload static methods
    static void displayData(){
        System.out.println("Data");
    }

    static void displayData(String data){
        System.out.println(data);
    }

    abstract void demo();

}

class AnotherDemo extends DemoClass{

    // Error - we cannot override static methods
//    @Override
//    static void displayData(){}


    @Override
    void demo() {

    }
}

public class Q9_StaticMethods {
    public static void main(String[] args) {

    }
}
