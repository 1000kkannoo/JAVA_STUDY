package ch3;

public class BiFunction {
    public static void main(String[] args) {
        java.util.function.BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        int result = add.apply(3, 5);
        System.out.println(result);
    }
}
