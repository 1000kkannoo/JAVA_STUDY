package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q4_피보나치_재귀 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        DFS(n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int DFS(int i) {
        if (i == 0) {
            arr[i] = 1;
            return 1;
        } else {
            arr[i] = DFS(i - 1);
            return arr[i - 1] + arr[i];
        }
    }


}
