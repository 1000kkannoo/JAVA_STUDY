import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11050 {
    static int n, k, count = 0, answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        DFS(1);
        System.out.println(answer);
    }

    private static void DFS(int i) {
        if (count == k) answer++;
        else {
            for (int j = i; j <= n; j++) {
                count++;
                DFS(j + 1);
                count--;
            }
        }
    }
}
