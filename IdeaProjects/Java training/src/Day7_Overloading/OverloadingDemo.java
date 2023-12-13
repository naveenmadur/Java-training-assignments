package Day7_Overloading;

class Addition{

    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    
    // VarArgs
    void add(int... number){
        int sum = 0;
        for (int a:number) {
            sum += a;
        }
        System.out.println(sum);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(10,20);
        addition.add(10,20,30);
        addition.add(10, 20, 30, 50, 60, 7080, 6);
    }
}
