package main.study.setion6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_선택정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(n, arr)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) index = j;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
