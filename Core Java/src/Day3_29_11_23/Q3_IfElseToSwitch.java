package Day3_29_11_23;

public class Q3_IfElseToSwitch {
    public static void main(String[] args) {
        int var = 2;

        switch (var){
            case 1:
                System.out.println("low");
                break;

            case 2:
                System.out.println("medium");
                break;

            case 3:
                System.out.println("high");
                break;

            default:
                System.out.println("abnormal");
        }
    }
}
