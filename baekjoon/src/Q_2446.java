import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2446 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = (N * 2) - 1;

        for (int i = 1, j = count; i <= N; i++, j -= 2) {
            sb.append(" ".repeat(i - 1));
            sb.append("*".repeat(j));
            sb.append("\n");
        }

        for (int i = N - 1, j = 3; i >= 1; i--, j += 2) {
            sb.append(" ".repeat(i - 1));
            sb.append("*".repeat(j));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
