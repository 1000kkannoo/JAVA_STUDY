import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2721 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = 1; j <= i + 1; j++) {
                    sum += j;
                }
                result += (i * sum);
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
