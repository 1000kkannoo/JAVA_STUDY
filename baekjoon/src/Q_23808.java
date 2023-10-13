import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23808 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            appendDraw(sb, n);
        }

        appendMiddleAndDown(sb, n);

        for (int i = 0; i < n; i++) {
            appendDraw(sb, n);
        }

        appendMiddleAndDown(sb, n);

        System.out.println(sb);
    }

    private static void appendDraw(StringBuilder sb, int n) {
        sb.append("@".repeat(n))
                .append("   ".repeat(n))
                .append("@".repeat(n))
                .append("\n");
    }

    private static void appendMiddleAndDown(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@@@@@".repeat(n)).append("\n");
        }
    }
}
