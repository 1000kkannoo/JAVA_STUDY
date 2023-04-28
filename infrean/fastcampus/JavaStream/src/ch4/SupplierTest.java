package ch4;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> "hello world";
        System.out.println(myStringSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        printRandomDoubles(myRandomDoubleSupplier,5);
    }

    public static void printRandomDoubles(Supplier<Double> random, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(random.get());
        }
    }
}
