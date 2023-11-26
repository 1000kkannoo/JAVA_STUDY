import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_13699 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] answer = new long[n + 1];
        answer[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                answer[i] += answer[j] * answer[i - 1 - j];
            }
        }

        System.out.println(answer[n]);
    }
}
