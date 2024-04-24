package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 바둑이_승차 {
    static int C, m, answer = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        C = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0);

        System.out.println(answer);
    }

    private static void DFS(int L, int sum) {
        if (sum > C) return;
        if (L == m) {
            answer = Math.max(answer, sum);
            return;
        }
        DFS(L + 1, sum + arr[L]);
        DFS(L + 1, sum);
    }

}
