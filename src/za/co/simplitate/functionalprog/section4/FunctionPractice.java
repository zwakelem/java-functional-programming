package za.co.simplitate.functionalprog.section4;

import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {

        List<String> list = List.of("Zwaks", "", "Sibo", "Simphy");

        Function<String, Integer> func = String::length;
        List<Integer> newList = mapList(list, func);
        System.out.println(newList);
    }

    private static <T,R> List<R> mapList(List<T> list, Function<T, R> func) {
        return list.stream().map(s -> func.apply(s)).toList();
    }
}
