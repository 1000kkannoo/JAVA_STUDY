import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2523 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Integer.parseInt(br.readLine())));
    }

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append("\n");
        }
        for (int i = n - 1; i > 0; i--) {
            sb.append("*".repeat(i)).append("\n");
        }

        return sb.toString();
    }
}
