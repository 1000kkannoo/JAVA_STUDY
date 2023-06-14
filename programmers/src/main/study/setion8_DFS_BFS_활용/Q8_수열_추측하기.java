package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q8_수열_추측하기 {
    static int[][] dy = new int[35][35];
    static int[] b, p, ch;
    static int n, f;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4
        n = sc.nextInt();
        // 16
        f = sc.nextInt();

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        DFS(0, 0);
    }

    private static void DFS(int index, int sum) {
        if (index == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            if (flag) return;
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[index] = i;
                    DFS(index + 1, sum + (p[index] * b[index]));
                    ch[i] = 0;
                }
            }
        }
    }

    private static int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (r == 0 || n == r) return 1;
        else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }
}
