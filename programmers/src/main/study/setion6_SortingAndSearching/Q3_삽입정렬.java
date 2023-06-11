package main.study.setion6_SortingAndSearching;

import java.util.Scanner;

public class Q3_삽입정렬 {
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
        for (int i = 1; i < n; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
