package Day13_Multithreading;

class Sample extends Thread{
     public void run(){
        System.out.println("This is run: " + Thread.currentThread());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.setName("A");
        Sample sample1 = new Sample();
        sample1.setName("B");
        Sample sample2 = new Sample();
        sample2.setName("C");

        sample.start();
        sample1.start();
        sample2.start();
    }
}
