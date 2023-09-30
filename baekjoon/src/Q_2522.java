import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2522 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int space = n - i;
            sb.append(" ".repeat(space)).append("*".repeat(i)).append("\n");
        }

        for (int i = n - 1; i > 0; i--) {
            int space = n - i;
            sb.append(" ".repeat(space)).append("*".repeat(i)).append("\n");
        }

        System.out.println(sb);
    }
}
