package za.co.simplitate.functionalprog.section4;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "a string";
        System.out.println(stringSupplier.get());

        Supplier<Double> randomNumberSupplier = Math::random;
        System.out.println(randomNumberSupplier.get());
    }
}
