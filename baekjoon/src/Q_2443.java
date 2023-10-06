import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2443 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1, j = 0; i <= N * 2; i += 2, j++) {
            sb.append(" ".repeat(j));
            sb.append("*".repeat((2 * N) - i)).append("\n");
        }

        System.out.println(sb);
    }
}
