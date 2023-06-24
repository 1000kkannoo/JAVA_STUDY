import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_15649 {
    static int[] ch, print;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        print = new int[m];
        ch = new int[n + 1];
        DFS(0);

        System.out.println(sb);
    }

    private static void DFS(int i) {
        if (i == m) {
            for (int n : print) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = 1; j <= n; j++) {
                if (ch[j] == 0) {
                    print[i] = j;
                    ch[j] = 1;
                    DFS(i + 1);
                    ch[j] = 0;
                }
            }
        }
    }
}
