import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_3474 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            while (n >= 5) {
                count += n / 5;
                n /= 5;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
