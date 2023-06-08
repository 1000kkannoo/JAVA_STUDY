package main.study.setion3_효율성_pointers;

import java.util.Scanner;

public class Q3_최대_매출_SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution3(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i + j];
            }
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    private static int solution2(int n, int m, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1, j = 0, cnt = 1; i <= n - m; cnt++) {
            sum += arr[j++];
            if (cnt == m) {
                answer = Math.max(answer, sum);
                j = i++;
                cnt = 0;
                sum = 0;
            }
        }
        return answer;
    }

    private static int solution3(int n, int m, int[] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        int answer = sum;
        for (int i = m; i < arr.length; i++) {
            sum += arr[i] - arr[i - m];
            answer = Math.max(answer,sum);
        }
        return answer;
    }

}
