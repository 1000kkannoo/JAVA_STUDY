package ch4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> myStringConsumer = (String str) ->
                System.out.println(str);

//        myStringConsumer.accept("hello");
//        myStringConsumer.accept("world");


        // Arrays.asList는 수를 추가하지못함 / 상수와 비슷해진다고 보면될듯
        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerProcessor = x ->
                System.out.println("Processing integer " + x);
//        process(integerInputs,myIntegerProcessor);

        Consumer<Integer> myDifferentIntegerProcessor = x ->
                System.out.println("Processing integer in different way " + x);
//        process(integerInputs, myDifferentIntegerProcessor);

        Consumer<Double> myDoubleProcessor = x ->
                System.out.println("Processing double " + x);
        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
        process(doubleInputs,myDoubleProcessor);
    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}
