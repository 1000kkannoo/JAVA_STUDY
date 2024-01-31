package main.level0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a) + b);
        int num2 = 2 * a * b;
        return Math.max(num1, num2);
    }
}
