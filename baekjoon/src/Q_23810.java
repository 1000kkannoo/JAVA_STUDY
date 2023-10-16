import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23810 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        appendMiddle(sb, n);
        appendSide(sb, n);
        appendMiddle(sb, n);
        appendDown(sb, n);

        System.out.println(sb);
    }

    private static void appendDown(StringBuilder sb, int n) {
        for (int i = 0; i < n * 2; i++) {
            sb.append("@".repeat(n)).append("\n");
        }
    }

    private static void appendSide(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append("\n");
        }
    }

    private static void appendMiddle(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n * 5)).append("\n");
        }
    }
}
