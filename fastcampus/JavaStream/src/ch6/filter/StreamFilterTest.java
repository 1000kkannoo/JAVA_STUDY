package ch6.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterTest {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
        Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
        List<Integer> filteredNumbers =
                filteredNumberStream.collect(Collectors.toList());
        System.out.println(filteredNumbers);

        List<Integer> newFilteredNumbers =
                Stream.of(3, -5, 7, 10, -3)
                        .filter(x -> x > 0)
                        .collect(Collectors.toList());
        System.out.println(newFilteredNumbers);
    }
}
