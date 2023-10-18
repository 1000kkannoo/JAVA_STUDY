import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23809 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        appendUp(sb, n);
        appendMiddleSide(sb, n);
        appendMiddle(sb, n);
        appendMiddleSide(sb, n);
        appendUp(sb, n);

        System.out.println(sb);
    }

    private static void appendUp(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(3 * n)).append("@".repeat(n)).append("\n");
        }
    }

    private static void appendMiddleSide(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(2 * n)).append("@".repeat(n)).append("\n");
        }
    }

    private static void appendMiddle(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(3 * n)).append("\n");
        }
    }
}
