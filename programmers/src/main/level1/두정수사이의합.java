package main.level1;

public class 두정수사이의합 {

    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }

    public static long solution(int a, int b) {
        long sum = 0L;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}
