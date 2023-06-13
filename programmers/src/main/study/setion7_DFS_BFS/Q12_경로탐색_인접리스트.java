package main.study.setion7_DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Q12_경로탐색_인접리스트 {
    static int count = 0, n, m;
    private static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n + 1];
        ch[1] = 1;
        DFS(1);
        System.out.println(count);
    }

    private static void DFS(int k) {
        if (k == n) count++;
        else {
            for (int next : graph.get(k)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    DFS(next);
                    ch[next] = 0;
                }
            }
        }
    }
}
