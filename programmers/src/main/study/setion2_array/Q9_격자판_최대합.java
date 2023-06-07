package main.study.setion2_array;

import java.util.Scanner;

public class Q9_격자판_최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int max = 0, leftSide = 0, rightSide = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, Math.max(sum1, sum2));
            leftSide += arr[i][i];
            rightSide += arr[i][n - i - 1];
        }

        return Math.max(max, Math.max(leftSide, rightSide));
    }
}
