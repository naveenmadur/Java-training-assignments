package Day11_Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] a = {
                new int[3],
                new int[4],
                new int[5],
        };

        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++, count++ ){
                a[i][j] = count;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int i = 10;

        String abc = "ABC";
        String d =  abc.replace("C","D");
        System.out.println(d);

//        for(int i=0;i<=5;i++){
//            for(int j = 0;j<=5;j++){
//                if(j ==0 || j == 5 || i ==0 || i ==5){
//                    System.out.print("* ");
//                } else{
//                System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}
