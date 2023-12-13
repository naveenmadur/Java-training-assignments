package Day3_ControlStatements;

public class IfElse {
    public static void main(String[] args) {
        int marks = 67;

        if(marks <= 100 && marks >= 70){
            System.out.println("Grade A");
        } else if (marks < 70 && marks >= 50) {
            System.out.println("Grade B");
        } else if (marks < 50 && marks >= 28){
            System.out.println("Grade C");
        } else{
            System.out.println("Grade F");
        }
    }
}
