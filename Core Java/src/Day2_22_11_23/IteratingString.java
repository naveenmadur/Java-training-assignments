package Day2_22_11_23;

public class IteratingString {
    public static void main(String[] args) {
        String name = "Naveen";
        // Need to convert String to a character array to iterate
        for (Character c: name.toCharArray()) {
            System.out.println(c);
        }
    }
}
