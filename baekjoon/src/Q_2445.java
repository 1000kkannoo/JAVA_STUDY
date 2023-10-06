import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2445 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1, j = (N * 2) - 2; i <= N; i++, j -= 2) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(j));
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        for (int i = N - 1, j = 2; i > 0; i--, j += 2) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(j));
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
