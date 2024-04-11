package ch3_TwoPoint;

import java.util.Scanner;

public class 연속된_자연수의_합 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0, sum = 0;
        int lt = 1, rt = 1;

        while (lt <= n / 2 + 1) {
            if (sum < n) {
                sum += rt;
                rt++;
            } else if (sum > n) {
                sum -= lt;
                lt++;
            } else {
                answer++;
                sum -= lt;
                lt++;
            }
        }

        return answer;
    }
}
