package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q2_이진수_재귀함수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    private static void DFS(int i) {
        if (i == 0) return;
        else {
            System.out.print(i % 2 + " ");
            DFS(i / 2);
        }
    }
}
