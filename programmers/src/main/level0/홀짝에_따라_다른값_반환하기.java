package main.level0;

import java.io.IOException;

public class 홀짝에_따라_다른값_반환하기 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        return sum;
    }
}
