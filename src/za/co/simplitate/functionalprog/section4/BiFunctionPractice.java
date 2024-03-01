package za.co.simplitate.functionalprog.section4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();
        System.out.println(biFunction.apply("Sim", "phy"));

        BinaryOperator<String> binaryOperator = (a, b) -> a + "." + b;
        System.out.println(binaryOperator.apply("Sim", "phy"));
    }
}
