import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23812 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        appendSide(sb, n);
        appendMiddle(sb, n);
        appendSide(sb, n);
        appendMiddle(sb, n);
        appendSide(sb, n);

        System.out.println(sb);
    }

    private static void appendMiddle(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n * 5)).append("\n");
        }
    }

    private static void appendSide(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n))
                    .append(" ".repeat(n * 3))
                    .append("@".repeat(n))
                    .append("\n");
        }
    }
}
