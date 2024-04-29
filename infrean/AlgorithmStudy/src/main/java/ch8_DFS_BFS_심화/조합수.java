package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 조합수 {
    static int[][] dy = new int[35][35];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        System.out.println(DFS(n, m));
    }

    private static int DFS(int n, int r) {
        if (dy[n][r]>0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }
}
