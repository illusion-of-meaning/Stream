package main.java.com.asherbakov;

import java.util.Arrays;

public class TaskSecond {
    public void printEvenNumbers(Integer... num) {
        Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
