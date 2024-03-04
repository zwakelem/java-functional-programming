package za.co.simplitate.functionalprog.section8;

public class ReferentialTransperancy {

    public static void main(String[] args) {
        int result = add(2, multiply(2,4));
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // this function is referentially transparent with the print statement
    public static int multiply(int a, int b) {
        System.out.println("multiply a=" + a + " and b=" + b);
        return a * b;
    }
}
