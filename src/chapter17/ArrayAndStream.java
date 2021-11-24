package chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAndStream {
    public static void main(String[] args) {
        Integer[] values = {2, 0, 5, 0, 3, 7, 1, 4, 8, 6};
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        System.out.printf("sorted values: %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));

        List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);

        System.out.printf("Sorted values greater than 4: %s%n", Arrays.stream(values).filter(value-> value > 4).sorted().collect(Collectors.toList()));
        System.out.printf("Values greater than 4 (ascending with streams): %s%n", greaterThan4.stream().sorted().collect(Collectors.toList()));

    }
}
