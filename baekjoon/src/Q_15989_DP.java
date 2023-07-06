import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15989_DP {
    static int n, count;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            n = Integer.parseInt(br.readLine());
            count = 0;
            for (int i = 1; i <= 3; i++) {
                DFS(i, i);
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static void DFS(int i, int sum) {
        if (n < sum) return;
        if (n == sum) count++;
        else {
            for (int j = i; j <= 3; j++) {
                DFS(j, sum + j);
            }
        }
    }
}
