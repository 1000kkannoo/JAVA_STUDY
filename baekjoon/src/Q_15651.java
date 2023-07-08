import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_15651 {
    static int n, m;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        answer = new int[m];

        DFS(0);
        System.out.println(sb);
    }

    private static void DFS(int i) {
        if (i == m) {
            for (int num : answer) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = 1; j <= n; j++) {
                answer[i] = j;
                DFS(i + 1);
            }
        }
    }
}
