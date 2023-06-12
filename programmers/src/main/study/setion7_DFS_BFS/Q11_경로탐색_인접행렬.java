package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q11_경로탐색_인접행렬 {
    static int count = 0;
    private static int[][] arr;
    private static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println();
    }

    private static void DFS(int n) {
        for (int i = n; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) {
                    DFS(j);
                    ch[j] = 1;
                }
                if (arr[i][])
            }
        }
    }
}
