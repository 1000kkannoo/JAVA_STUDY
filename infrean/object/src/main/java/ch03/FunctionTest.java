package ch03;

public class FunctionTest {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(30, 50);
        System.out.println(total);
        sayHello("Hello");

        int sum = calcSum();
        System.out.println(sum);

        double v = doubleSum(n1, n2);
        System.out.println(v);
    }

    // main 이 public static 으로 선언되었기에 static 메서드로 함수를 정의
    // static 은 프로그램이 실행될때 클래스 영역에 메모리를 저장
    // 즉, 해당 영역에서만 사용이 가능하므로 다른 메모리에 저장되는 것들은 사용하지 못하기 때문에
    // 메서드 또한 static 으로 선언되어야 한다.

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String str) {
        System.out.println(str);
    }

    public static int calcSum() {
        int i;
        int sum = 0;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static double doubleSum(int a, int b) {
        // 제곱
        return Math.pow(a + b, 2);
    }
}
