package za.co.simplitate.functionalprog.section4;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ConsumerPractice {

    public static void main(String[] args) {

        List<Integer> ints = IntStream.range(1, 9).boxed().toList();
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(45);
        
        printElements(consumer, ints);
    }

    private static <T> void printElements(Consumer<T> consumer, List<T> ints) {
        ints.stream().forEach(i -> consumer.accept(i));
    }
}
