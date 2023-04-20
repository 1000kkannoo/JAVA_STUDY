package ch09;

public class ConstantTest {

    public static void main(String[] args) {
        // 변하지 않는 수, 상수는 final로 명시
        final int MAX_NUM = 1024;
        final int MIN_NUM = 10;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
