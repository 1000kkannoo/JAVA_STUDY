package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q11_경로탐색_인접행렬 {
    static int count = 0;
    private static int[][] graph;
    private static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch = new int[n + 1];
        ch[1] = 1;
        DFS(1);
        System.out.println(count);
    }

    private static void DFS(int k) {
        if (k == graph.length - 1) count++;
        else {
            for (int i = 1; i < graph.length; i++) {
                if (graph[k][i] == 1 && ch[i] != 1) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
