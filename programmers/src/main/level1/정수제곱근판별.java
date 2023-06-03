package main.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
/*        long i = 1L;
        long sum = 0;
        while (true) {
            sum = i * i;
            if (sum == n) {
                return (long) (i + 1) * (i + 1);
            }
            if (i >= n / 2) {
                return -1;
            }
            i++;
        }*/
    }
}
