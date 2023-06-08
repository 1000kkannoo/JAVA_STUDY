package main.study.setion3_효율성_pointers;

import java.util.Scanner;

public class Q5_연속된_자연수의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution3(n));
    }

    private static int solution(int n) {
        int lt = 1, rt = 1, sum = 1, answer = 0;
        int length = (n / 2) + 1;
        while (rt <= length) {
            sum = (sum < n) ? sum + ++rt : sum - lt++;
            if (sum == n) {
                answer++;
                sum -= lt++;
            }
        }
        return answer;
    }

    private static int solution2(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    private static int solution3(int n) {
        int num = 2, answer = 0;
        for (int m = n - 1 - 2; m >= 0; m -= ++num) {
            answer = (m % num == 0) ? answer + 1 : answer;
        }
        return answer;
    }
}
