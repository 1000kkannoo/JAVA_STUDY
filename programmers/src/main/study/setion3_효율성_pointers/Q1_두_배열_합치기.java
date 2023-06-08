package main.study.setion3_효율성_pointers;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_두_배열_합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int num : solution3(n, arr1, m, arr2)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n + m];

        for (int i = 0; i < n; i++) {
            answer[i] = arr1[i];
        }
        for (int i = n, j = 0; i < answer.length; i++) {
            answer[i] = arr2[j];
            j++;
        }
        Arrays.sort(answer);
        return answer;
    }

    private static int[] solution2(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n + m];

        for (int i = 0, arr1p = 0, arr2p = 0; i < answer.length; i++) {
            if (arr1p >= n) {
                answer[i] = arr2[arr2p];
                arr2p++;
                continue;
            } else if (arr2p >= m) {
                answer[i] = arr1[arr1p];
                arr1p++;
                continue;
            }
            answer[i] = (arr1[arr1p] > arr2[arr2p]) ? arr2[arr2p++] : arr1[arr1p++];
        }

        return answer;
    }

    private static int[] solution3(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n + m];

        int i = 0, arr1p = 0, arr2p = 0;
        while (arr1p < n && arr2p < m){
            answer[i++] = (arr1[arr1p] > arr2[arr2p]) ? arr2[arr2p++] : arr1[arr1p++];
        }
        while (arr1p < n) answer[i++] = arr1[arr1p++];
        while (arr2p < m) answer[i++] = arr2[arr2p++];

        return answer;
    }
}
