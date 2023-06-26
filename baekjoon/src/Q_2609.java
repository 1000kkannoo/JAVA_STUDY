import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int r1 = gcd(Math.max(n, m), Math.min(n, m));
        int r2 = n * m / r1;

        System.out.println(r1 + "\n" + r2);
    }

    private static int gcd(int max, int min) {
        if (min == 0) return max;
        else return gcd(min, max % min);
    }
}
