package Day3_29_11_23;




public class Q1_and_2_ConditionalStatements {
    public static void main(String[] args) {
        int number1 = 3;
        if(number1 >= 0)
            if(number1 == 0)
                System.out.println("First");
        else
                System.out.println("Second");

        System.out.println("Third");


        // Using line breaks
        if(number1 >= 0){
            if(number1 == 0){
                System.out.println("First");
            } else{
                System.out.println("Second");
            }
        }
        System.out.println("Third");
    }
}
