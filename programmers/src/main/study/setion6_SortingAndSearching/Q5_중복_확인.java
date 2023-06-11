package main.study.setion6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_중복_확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solution2(n, arr));
    }

    private static Character solution2(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return 'D';
        }
        return 'U';
    }

    private static Character solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) return 'D';
            }
        }
        return 'U';
    }
}
