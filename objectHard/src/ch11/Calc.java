package ch11;

// 모든 변수는 상수로 변환됨
// 모든 선언된 메서드는 추상 메서드
public interface Calc {
    public static final double PI = 3.14;
    int Error = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
