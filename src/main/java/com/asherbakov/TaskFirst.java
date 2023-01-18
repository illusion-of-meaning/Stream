package main.java.com.asherbakov;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class TaskFirst {
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

    }
}
