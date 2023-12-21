package Day4_6_12_23;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    private static char getNextAlphabet(char ch) {
        if (ch == 'z') return 'a';
        if (ch == 'Z') return 'A';
        return (char) (ch + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Q1
//        System.out.print("Please enter a String: ");
//        String inputString = scanner.next();
//
//        char[] characters =  inputString.toLowerCase().toCharArray();
//        Arrays.sort(characters);
//        System.out.println(characters);
//
//
//        // Q2
//        ArrayList<Character> vowels = new ArrayList<Character>();
//        Set<Character> uniqueCharacters = new HashSet<>();
//        for (char character : characters) {
//            if(isVowel(character)){
//                vowels.add(character);
//            }
//            uniqueCharacters.add(character);
//        }
//        Set<Character> set = new HashSet<>(vowels);
//
//        System.out.println("Number of vowels: "+ (long) set.size());
//
//        // Q3
//        System.out.println("Removed all repeated characters: " + uniqueCharacters);
//
//        // Q4
//        String trimmedString = inputString.trim();

//        // Q5
//        System.out.println("Please Enter 5 Names: ");
//        String[] names = new String[5];
//        for (int i = 0; i<5; i++){
//            names[i] = scanner.next();
//        }
//        System.out.println("Sorted and replaced vowel to its next alphabet");
//        Arrays.sort(names);
//        for (String name : names) {
//            char[] characters = name.toCharArray();
//            for(int i = 0; i<characters.length; i++){
//                if(isVowel(characters[i])){
//                characters[i] = getNextAlphabet(characters[i]);
//                }
//            }
//            String replacedName = new String(characters);
//            System.out.println(replacedName);
//        }

        // Q7
        String expression = "3 + (20 % 2) * 20 / 2";
        String pattern = "\\d+|[-+*/()]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(expression);
        ArrayList<String> tokens = new ArrayList<>();
        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        for (String token : tokens) {
            System.out.println(token);
        }

        ArrayList<String> operands = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                operands.add(token);
            } else {
                operators.add(token);
            }
        }

        // Print the operands and operators
        System.out.println("Operands:");
        for (String operand : operands) {
            System.out.println(operand);
        }

        System.out.println("Operators:");
        for (String operator : operators) {
            System.out.println(operator);
        }

        // Q8
        Employee employee = new Employee("101","Demo","Pune",50000);

    }
}


class Employee{
    private String emp_id;
    private String emp_name;
    private String emp_address;
    private double emp_sal;

    Employee(String emp_id, String emp_name, String emp_address, double emp_sal){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_sal = emp_sal;
    }

}