package Day3_29_11_23;

import java.util.Scanner;

public class Q5_GreatestAmongTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer value: ");
        int number1 = scanner.nextInt();

        System.out.println();

        System.out.print("Enter second integer value: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("Number1 is greater than Number2: " + number1);
        } else{
            System.out.println("Number2 is greater than Number1: " + number2);
        }
    }
}
