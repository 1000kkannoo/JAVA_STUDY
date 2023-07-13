import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2441 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i >= 1; i--) {
            sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}
