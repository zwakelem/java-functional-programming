package za.co.simplitate.functionalprog.section4;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> func = (str) -> str.substring(0, 2);
        var funcStr = func.execute("Zwaks");
        System.out.println(funcStr);

        FunctionalGenerics<String, Integer> func1 = (str) -> str.length() * 2;
        var funcInt = func1.execute("Zwaks");
        System.out.println(funcInt);
    }
}
