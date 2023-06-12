package main.study.setion7_DFS_BFS;

import java.util.Scanner;

public class Q6_부분집합_구하기 {
    static int n;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        DFS(1);
    }

    private static void DFS(int level) {
        if (level == n + 1) {
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            ch[level] = 1;
            DFS(level + 1);
            ch[level] = 0;
            DFS(level + 1);
        }
    }
}
