package ch7_DFS_BFS;

import java.util.Scanner;

public class 재귀함수 {
    static StringBuilder sb = new StringBuilder();
    static int line;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        line = sc.nextInt();
        DFS(1);

        System.out.println(sb.toString());
    }

    private static void DFS(int n) {
        if (line >= n) {
            sb.append(n).append(" ");
            DFS(n + 1);
        }
    }

}
