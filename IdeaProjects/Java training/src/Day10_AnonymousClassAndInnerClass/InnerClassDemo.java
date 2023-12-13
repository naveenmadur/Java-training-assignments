package Day10_AnonymousClassAndInnerClass;


class OuterClass{

    String name = "Coditas";
    String lastName = "LLP";

    static String  staticName = "Coditas";
    InstanceClass instanceClass = new InstanceClass();

    StaticClass staticClass = new StaticClass();

    // Instance class
    class InstanceClass{
        public void fullName(){
            String fullName = name + " " + lastName;
            System.out.println("Full Name:" + fullName);
        }
    }

    // Static class
    static class StaticClass{
        public void displayName(){
            System.out.println("Static class");
        }

        static void staticDisplayName(){
            System.out.println(staticName);
        }
    }


    void show(){
        String lastName = "LLP";
        class LocalInnerClass{
            public void fullName(){
                String fullName = name + " " + lastName;
                System.out.println("Full Name:" + fullName);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.fullName();
    }
}


public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.show();

        // Way 1
        outerClass.instanceClass.fullName();

        // Way 2
        OuterClass.InstanceClass instanceClass = outerClass.new InstanceClass();

        //Way 3
        OuterClass.InstanceClass instanceClass1 = new OuterClass().new InstanceClass();


        // Static class
        OuterClass.StaticClass.staticDisplayName();

        // way 1
        OuterClass outerClass1 = new OuterClass();
        outerClass1.staticClass.displayName();

        // way 2
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        staticClass.displayName();

    }
}
