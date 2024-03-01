package za.co.simplitate.functionalprog.lambda2;

public class MathOperationMain {

    public static void main(String[] args) {

        MathOperation add = (a,b) -> System.out.println(a + b);
        add.operation(10,5);

        MathOperation multiply = (a,b) -> System.out.println(a * b);
        multiply.operation(10, 5);
    }
}
