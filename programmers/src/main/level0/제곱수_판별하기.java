package main.level0;

public class 제곱수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(976));
    }

    private static int solution(int n) {
        return (n % Math.sqrt(n) == 0) ? 1 : 2;
    }
}
