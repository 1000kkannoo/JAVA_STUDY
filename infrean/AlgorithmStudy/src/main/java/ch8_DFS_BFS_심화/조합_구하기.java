package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 조합_구하기 {
    static int n, m;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        result = new int[m];
        DFS(0, 1);

        System.out.println(sb);
    }

    private static void DFS(int depth, int index) {
        if (depth == m) {
            for (int n : result) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = index; i <= n; i++) {
                result[depth] = i;
                DFS(depth + 1, i + 1);
            }
        }
    }
}
