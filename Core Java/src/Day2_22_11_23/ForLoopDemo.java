package Day2_22_11_23;

public class ForLoopDemo {
    public static void main(String[] args) {

        // Tables from 1 to 10
        for (int i =1; i <= 10; i++){
            System.out.println(i + " Times table:");
            for (int j=1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        char alphabet = 'A';
        for(int i=0; i < 26; i++){
            System.out.print(alphabet + " ");
            alphabet++;
        }


    }
}
