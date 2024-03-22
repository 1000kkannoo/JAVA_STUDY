import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15652_복습 {
    static int n, m;
    static int[] print;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];
        DFS(0, 1);

        System.out.println(sb);
    }

    private static void DFS(int i, int num) {
        if (i == m) {
            for (int n : print) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = num; j <= n; j++) {
                print[i] = j;
                DFS(i + 1, j);
            }
        }
    }
}
