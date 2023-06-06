package main.study.setion2_array;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : solution2(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution2(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int[] sortArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortArr);

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = sortArr[i];
            sortArr[i] = sortArr[j];
            sortArr[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            int st = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] == sortArr[j]) {
                    break;
                }
                st++;
            }
            answer[i] = st;
        }

        return answer;
    }
}
