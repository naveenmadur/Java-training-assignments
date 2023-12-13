package Day9_Static;


class Demo{
    public void add(){
        System.out.println("Add method");
    }
    static {
        System.out.println("Bloc 1");
    } static {
        System.out.println("Bloc 1");
    }
}

public class StaticDemo {

    static {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.add();
    }
}
