package za.co.simplitate.functionalprog.section8;

public class JavaClosure {

    public static void main(String[] args) {
        int val = 11;
        Task lambda = () -> {
//            val = 12; val needs to be final or effectively final
            System.out.println(val);
            System.out.println("Task completed!!");
        };
        printValue(lambda);
    }

    private static void printValue(Task lambda) {
        // value printed here is passed with the function
        lambda.doTask();
    }
}
