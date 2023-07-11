import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_15650 {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        answer = new int[m];

        DFS(1, 0);
        System.out.println(sb);
    }

    private static void DFS(int start, int i) {
        if (i == m) {
            for (int k : answer) {
                sb.append(k).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = start; j <= n; j++) {
                answer[i] = j;
                DFS(j + 1, i + 1);
            }
        }
    }
}
