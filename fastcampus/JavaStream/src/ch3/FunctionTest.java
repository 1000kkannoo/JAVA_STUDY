package ch3;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        /* OOP 프로그래밍
        Function<Integer,Integer> myAdder =  new Adder();
        Integer result = myAdder.apply(5);
        System.out.println(result);
        */

        Function<Integer, Integer> myAdder = x ->  x + 10;
        int result = myAdder.apply(3);
        System.out.println(result);
    }
}
