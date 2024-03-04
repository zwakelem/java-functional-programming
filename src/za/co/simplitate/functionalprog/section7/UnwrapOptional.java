package za.co.simplitate.functionalprog.section7;

import java.util.Optional;

public class UnwrapOptional {

    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);
        Integer integerVal = optional.get();
        System.out.println(integerVal);

        Optional<Integer> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional.get()); // NoSuchElementException
        System.out.println(emptyOptional.isPresent() ? emptyOptional.get() : 0);
        System.out.println(emptyOptional.orElse(0));
        System.out.println(emptyOptional.orElseGet(() -> 0));
        System.out.println(emptyOptional.orElseThrow(() -> new IllegalArgumentException()));
    }
}
