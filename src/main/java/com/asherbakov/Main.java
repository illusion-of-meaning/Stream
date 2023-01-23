package main.java.com.asherbakov;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Stream<Integer> stream = Stream.of(8, 16, 32, 1, 9, -12, 0);

        new TaskFirst().findMinMax(stream,
                Integer::compareTo,
                (a1, a2) -> System.out.printf("Min: %s; max: %s%n", a1, a2)
        );

        // Task 2
        new TaskSecond().printEvenNumbers(1, 8, 12, 6, 48, 24, 23, 11);
    }
}
