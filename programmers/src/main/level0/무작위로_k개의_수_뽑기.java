package main.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 무작위로_k개의_수_뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(arr, k)) {
            System.out.println(num + " ");
        }
    }

    private static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int i = 0;
        for (int n : arr) {
            if (i == k) break;
            boolean flag = true;
            for (int ch : answer) {
                if (n == ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer[i++] = n;
        }
        return answer;
    }
}
