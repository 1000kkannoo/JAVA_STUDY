import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10480 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            int abs = Math.abs(n);
            if (abs % 2 == 0) {
                sb.append(n).append(" is even").append("\n");
            } else {
                sb.append(n).append(" is odd").append("\n");
            }
        }

        System.out.println(sb);
    }
}
