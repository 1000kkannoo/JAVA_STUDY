package ch2_Array;

import java.util.Scanner;

public class 피보나치_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        return sb.toString();
    }
}
