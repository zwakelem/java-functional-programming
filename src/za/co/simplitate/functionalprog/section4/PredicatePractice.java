package za.co.simplitate.functionalprog.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicatePractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Zwaks");
        list.add("");
        list.add("Sibo");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(predicate, list);

        Predicate<String> startsWithS = s -> s.startsWith("S");
        List<String> filteredList = filterList(startsWithS, list);

        List<Integer> intList = IntStream.rangeClosed(0,9).boxed().toList();
        Predicate<Integer> evens = i -> i % 2 == 0;
        List<Integer> evenList = filterList(evens, intList);

        System.out.println(newList);
        System.out.println(filteredList);
        System.out.println(evenList);
    }

    private static <T> List<T> filterList(Predicate<T> predicate, List<T> list) {
        List<T> retList = new ArrayList<>();
        for (T str: list) {
            if(predicate.test(str)) {
                retList.add(str);
            }
        }
        return retList;
    }
}
