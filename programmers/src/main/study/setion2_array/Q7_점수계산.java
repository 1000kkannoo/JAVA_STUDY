package main.study.setion2_array;

import java.util.Scanner;

public class Q7_점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int sum = 0;
        int cnt = 0;
        for (int num : arr) {
            if (num == 1) {
                cnt++;
                sum += cnt;
            }
            else cnt = 0;
        }
        return sum;
    }
}
