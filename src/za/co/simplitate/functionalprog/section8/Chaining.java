package za.co.simplitate.functionalprog.section8;

import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

        Consumer<String> c3 = s -> {
          c1.accept("Hello");
          c2.accept("Hello");
        };

        c3.accept("Hello");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("World");

        Function<Integer, Integer> f1 = i -> i + 2;
        Function<Integer, Integer> f2 = i -> i * 2;
        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
