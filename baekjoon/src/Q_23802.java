import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23802 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("@@@@@".repeat(n)).append("\n");
        }

        for (int i = 0; i < n * 4; i++) {
            sb.append("@".repeat(n)).append("\n");
        }

        System.out.println(sb);
    }
}
