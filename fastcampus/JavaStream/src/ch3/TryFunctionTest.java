package ch3;

import util.TryFunction;

public class TryFunctionTest {
    public static void main(String[] args) {
        TryFunction<Integer,Integer,Integer,Integer> addThreeNumbers =
                (x, y, z) ->  x + y + z;

        Integer result = addThreeNumbers.apply(3, 2, 5);
        System.out.println(result);
    }
}
