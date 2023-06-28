import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1735 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[2];
        int[] B = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 2; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 2; i++) B[i] = Integer.parseInt(st.nextToken());

        // 0이 분자, 1이 분모

        int gcd = GCD(Math.max(A[1], B[1]), Math.min(A[1], B[1]));
        int lcm = A[1] * B[1] / gcd;
        int sum = (A[0] * (lcm / A[1])) + (B[0] * (lcm / B[1]));

        int finalGcd = GCD(Math.max(sum, lcm), Math.min(sum, lcm));
        sum = sum / finalGcd;
        lcm = lcm / finalGcd;

        sb.append(sum).append(" ").append(lcm);
        System.out.println(sb);
    }

    private static int GCD(int max, int min) {
        if (min == 0) return max;
        else return GCD(min, max % min);
    }
}
