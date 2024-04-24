package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이_같은_부분집합 {
    static int n, sum = 0, match;
    static int[] arr;
    static String answer = "NO";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            match += arr[i];
        }

        DFS(sum, 0);

        System.out.println(answer);
    }

    private static void DFS(int sum, int i) {
        if (answer.equals("YES") || i == n) return;
        else {
            for (int j = i; j < n; j++) {
                sum += arr[j];
                int result = match - sum;
                if (sum == result) {
                    answer = "YES";
                }
                DFS(sum, j + 1);
                sum -= arr[j];
            }
        }
    }
}
