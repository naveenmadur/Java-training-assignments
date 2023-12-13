package Day4_6_12_23;

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q1
        System.out.print("Please enter a String: ");
        String inputString = scanner.next();

        char[] characters =  inputString.toLowerCase().toCharArray();
        Arrays.sort(characters);
        System.out.println(characters);


        // Q2
        ArrayList<Character> vowels = new ArrayList<Character>();
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char character : characters) {
            if(character == 'a' || character == 'e' ||
                    character == 'i' ||
                    character == 'o' ||
                    character == 'u'){
                vowels.add(character);
            }
            uniqueCharacters.add(character);
        }
        Set<Character> set = new HashSet<>(vowels);

        System.out.println("Number of vowels: "+ (long) set.size());

        // Q3
        System.out.println("Removed all repeated characters: " + uniqueCharacters);

        // Q4
        String trimmedString = inputString.trim();

    }
}
