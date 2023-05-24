package ch4;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerTest {
    public static void main(String[] args) {
        BiConsumer<Integer,Double> myDoublerProcessor =
                (index, input) ->
                        System.out.println("Processing " + input + " at index " + index);
        List<Double> inputs = Arrays.asList(1.1,2.2,3.3);
        process(inputs,myDoublerProcessor);
    }

    public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
        for (int i = 0; i < inputs.size(); i++) {
            processor.accept(i, inputs.get(i));
        }
    }
}
