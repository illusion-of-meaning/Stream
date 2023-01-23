package main.java.com.asherbakov;

import java.util.Arrays;

public class TaskSecond {
    /**
     * Вывод в консоль чётных чисел
     * @param num - список целых чисел
     */
    public void printEvenNumbers(Integer... num) {
        Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
