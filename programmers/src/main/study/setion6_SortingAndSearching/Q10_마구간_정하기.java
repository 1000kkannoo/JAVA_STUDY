package main.study.setion6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_마구간_정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    private static int count(int[] arr, int dist) {
        int cnt = 1, end = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - end >= dist) {
                cnt++;
                end = arr[i];
            }
        }
        return cnt;
    }
}
