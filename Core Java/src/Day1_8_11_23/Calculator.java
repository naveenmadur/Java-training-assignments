package Day1_8_11_23;

class Addition{
    public void add(int number1, int number2){
        System.out.println("Addition is: " + (number1 + number2));
    }
}


class Subtraction{
    public void subtract(int number1, int number2){
        System.out.println("Subtraction is: " + (number1 - number2));
    }
}


class Multiplication{
    public void multiply(int number1, int number2) {
        System.out.println("Multiplication is: " + (number1 * number2));
    }
}

class Division{
    public void divide(int number1, int number2) {
        System.out.println("Division is: " + (number1 / number2));
    }
}


public class Calculator {
    public static void main(String[] args) {
        final Addition addition = new Addition();
        addition.add(1,2);
        final Subtraction subtraction = new Subtraction();
        subtraction.subtract(4,2);
        final Multiplication multiplication = new Multiplication();
        multiplication.multiply(5,4);
        final Division division = new Division();
        division.divide(6,3);
    }
}

