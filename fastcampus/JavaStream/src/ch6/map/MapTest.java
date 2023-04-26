package ch6.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, -4);
        List<Integer> numberListX2 = numberList.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(numberListX2);

        Stream<Integer> numberListStream = numberList.stream();
        Stream<String> strStream = numberListStream.map(x -> "Number is " + x);
        List<String> strList = strStream.collect(Collectors.toList());
        System.out.println(strList);
    }
}
