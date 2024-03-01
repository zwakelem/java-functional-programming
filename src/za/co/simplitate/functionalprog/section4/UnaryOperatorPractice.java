package za.co.simplitate.functionalprog.section4;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class UnaryOperatorPractice {

    public static void main(String[] args) {

        List<Integer> ints = IntStream.rangeClosed(2,7).boxed().toList();
        UnaryOperator<Integer> doubler = i -> i * 2;
        List<Integer> doubledInts = mapper(ints, doubler);
        System.out.println(doubledInts);
    }

    private static <T> List<T> mapper(List<T> ints, UnaryOperator<T> operator) {
        return ints.stream().map(i -> operator.apply(i)).toList();
    }
}
