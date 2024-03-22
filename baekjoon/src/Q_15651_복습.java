import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15651_복습 {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] print;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];

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
                print[i] = j;
                DFS(i + 1);
            }
        }
    }


}
