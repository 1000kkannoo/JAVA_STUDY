package main.study.setion10_동적계획법;

import java.util.Scanner;

public class S10Q3_최대부분증가수열 {
    static int[] arr, dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] <= arr[i]) dy[i] = Math.max(dy[i], dy[j] + 1);
                max = Math.max(dy[i], max);
            }
        }
        return max;
    }
}
