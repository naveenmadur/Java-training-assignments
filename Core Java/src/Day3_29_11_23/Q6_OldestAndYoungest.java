package Day3_29_11_23;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_OldestAndYoungest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age 1: ");
        int age1 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter age 2: ");
        int age2 = scanner.nextInt();
        System.out.println();
        System.out.print("Enter age 1: ");
        int age3 = scanner.nextInt();
        System.out.println();

        int[] arr = {age1,age2,age3};
        System.out.println("Youngest: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Oldest: " + Arrays.stream(arr).max().getAsInt());

    }
}
