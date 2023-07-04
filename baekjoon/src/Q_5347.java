import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_5347 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = GCD(a, b);
            long lcm = (long) a * b / gcd;
            sb.append(lcm).append("\n");
        }

        System.out.println(sb);
    }

    private static int GCD(int max, int min) {
        while (true) {
            if (min == 0) return max;
            else {
                int temp = max;
                max = min;
                min = temp % min;
            }
        }
    }
}
