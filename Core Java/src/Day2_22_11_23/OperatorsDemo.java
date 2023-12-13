package Day2_22_11_23;

abstract class Operator{
    int a = 10;
    int b = 20;

    boolean x = true;
    boolean y = false;
    abstract void display();
}

class ArithmeticOperators extends Operator{
    @Override
    void display(){
        System.out.println("a + b : " + (a+b));
        System.out.println("a - b : " + (a-b));
        System.out.println("a * b : " + (a*b));
        System.out.println("a / b : " + (a/b));
        System.out.println("a % b : " + (a%b));
    }
}

class UnaryOperators extends Operator{
    void display(){
        System.out.println("a++ : " + (a++));
        System.out.println("++a : " + (++a));
        System.out.println("a-- : " + (a--));
        System.out.println("--a : " + (--a));
    }
}

class AssignmentOperators extends  Operator{
    void display(){
        b = a;
        System.out.println("b = a : " + (b));
        System.out.println("a += 3 : " + (a += 3));
        System.out.println("a -= 3 : " + (a -= 3));
        System.out.println("a *= 3 : " + (a *= 3));
        System.out.println("a /= 3 : " + (a /= 3));
        System.out.println("a %= 3 : " + (a %= 3));
    }
}

class RelationalOperators extends Operator{
    void display(){
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }
}

class LogicalOperators extends  Operator {
    @Override
    void display(){
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
        System.out.println("!y : " + (!y));
    }
}

class TernaryOperators extends Operator {
    @Override
    void display() {
        System.out.println((a>b) ? "A is greater than B" : "B is greater than A");
    }
}

class BitwiseAndShiftOperators extends Operator {
    @Override
    void display() {
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a    : " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));

    }
}

public class OperatorsDemo {
    public static void main(String[] args) {
        Operator operator;
        System.out.println("Arithmetic Operators: \n");
        operator = new ArithmeticOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Unary Operators: \n");
        operator = new UnaryOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Assignment Operators: \n");
        operator = new AssignmentOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Relational Operators: \n");
        operator = new RelationalOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Logical Operators: \n");
        operator = new LogicalOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Logical Operators: \n");
        operator = new TernaryOperators();
        operator.display();

        System.out.println("====================================");
        System.out.println("Logical Operators: \n");
        operator = new BitwiseAndShiftOperators();
        operator.display();
    }
}
