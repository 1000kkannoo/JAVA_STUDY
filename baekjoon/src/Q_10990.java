import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10990 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1, j = n - 1; i <= n; i++, j--) {
            String repeat = (i != 1) ? " ".repeat((i * 2) - 3) : "";
            sb.append(" ".repeat(j))
                    .append("*")
                    .append(repeat)
                    .append("*")
                    .append("\n");

            if (i == 1) sb.delete(sb.length()-2, sb.length()).append("\n");
        }

        System.out.println(sb);
    }
}
