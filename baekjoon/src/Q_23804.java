import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23804 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        appendUpAndDown(sb, n);
        appendMiddle(sb, n);
        appendUpAndDown(sb, n);

        System.out.println(sb);
    }

    private static void appendMiddle(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append("\n");
            sb.append("@".repeat(n)).append("\n");
            sb.append("@".repeat(n)).append("\n");
        }
    }

    private static void appendUpAndDown(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append("@@@@@".repeat(n)).append("\n");
        }
    }
}
