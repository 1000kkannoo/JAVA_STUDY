package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q1_재귀함수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DFS(n);
    }

    private static void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
}
