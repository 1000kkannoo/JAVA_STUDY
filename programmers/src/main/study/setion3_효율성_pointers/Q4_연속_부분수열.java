package main.study.setion3_효율성_pointers;

import java.util.Scanner;

public class Q4_연속_부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution2(n, m, arr));
    }

    private static int solution2(int n, int m, int[] arr) {
        int answer = 0, lt = 0, rt = 0, sum = 0;
        while (rt < n) {
            sum = (sum < m) ? sum + arr[rt++] : sum - arr[lt++];
            if (sum == m) {
                answer++;
                sum -= arr[lt++];
            }
        }
        return answer;
    }

    private static int solution3(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }
}
