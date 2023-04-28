package ch02Lambda;

public class TestAdd {

    public static void main(String[] args) {
        Add addF = (x, y) -> x + y;
        System.out.println(addF.add(3, 5));

        MyMax max = (x,y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(5,10));
    }
}
