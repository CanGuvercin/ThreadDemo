package eu.guvercin;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Thread A"));
        Thread t2 = new Thread(new MyTask("Thread B"));

        t1.start();
        t2.start();

        System.out.println("Main thread is done!");
    }
}