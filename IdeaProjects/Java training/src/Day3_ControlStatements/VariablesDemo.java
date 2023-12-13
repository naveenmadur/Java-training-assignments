package Day3_ControlStatements;

class Demo{
    int number1;
    static int result;

    void displayData(){
        int number2 = 5;
        result = number1 + number2;
        System.out.println("Result: " + result);
    }

}

public class VariablesDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.number1 = 5;
        demo.displayData();
        Demo.result = 0;
        System.out.println("Result in Main: " + Demo.result);

        String a = "ABCD";
        for (char b:a.toCharArray()) {
            System.out.println(b);
        }
    }
}
