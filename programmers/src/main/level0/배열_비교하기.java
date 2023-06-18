package main.level0;

import java.util.Arrays;
import java.util.Scanner;

public class 배열_비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(solution(arr1, arr2));
    }

    private static int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            return Integer.compare(sum1, sum2);
        }
        else return Integer.compare(arr1.length, arr2.length);
    }
}
