package main.study.setion8_DFS_BFS_활용;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_합이_같은_부분_집합 {
    static String answer = "NO";
    static int[] arr;
    static int val;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        val = Arrays.stream(arr).sum();
        System.out.println(DFS(0, 0));
    }

    private static String DFS(int i, int sum) {
        if (answer.equals("YES")) return answer;
        if (sum > val / 2) return answer;
        if (i == arr.length) {
            if ((val - sum) == sum) answer = "YES";
        } else {
            DFS(i + 1, sum + arr[i]);
            DFS(i + 1, sum);
        }
        return answer;
    }
}
