import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1934 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = getGCD(Math.max(a, b), Math.min(a, b));
            sb.append((a * b) / gcd).append("\n");
        }

        System.out.println(sb);
    }

    private static int getGCD(int max, int min) {
        if (min == 0) return max;
        else return getGCD(min, max % min);
    }
}
