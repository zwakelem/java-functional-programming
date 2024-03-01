package za.co.simplitate.functionalprog;

public class Main {
    public static void main(String[] args) {
        /*Thread t = new Thread(() -> System.out.println("Thread executed!!"));
        t.start();*/

        onTheFly(() -> System.out.println("Heita!!"));
    }

    public static void onTheFly(MyFunInterface fun) {
        fun.myMethod();
    }
}