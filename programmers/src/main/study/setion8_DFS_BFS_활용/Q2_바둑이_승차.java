package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q2_바둑이_승차 {
    static int c, max;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        max = 0;
        c = sc.nextInt();
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(0, 0);
        System.out.println(max);
    }

    private static void DFS(int index, int sum) {
        if (sum > c) return;
        if (index == arr.length) max = Math.max(max, sum);
        else {
            DFS(index + 1, sum + arr[index]);
            DFS(index + 1, sum);
        }
    }
}
