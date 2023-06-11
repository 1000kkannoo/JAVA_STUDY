package main.study.setion6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int max = 0, min = 0, answer = 0;
        for (int i = 0; i < n; i++) {
            max += arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                min = arr[i + 1];
            }
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            int count = countedCd(n, mid, arr);

            if (count > m) {
                min = mid + 1;
            } else {
                answer = mid;
                max = mid - 1;
            }
        }

        return answer;
    }

    private static int countedCd(int n, int mid, int[] arr) {
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > mid) {
                sum = arr[i];
                count++;
            }
        }
        return count + 1;
    }
}
