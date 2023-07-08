import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_28097 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        int rest = 8 * (n - 1);
        int answer = sum + rest;

        sb.append(answer / 24).append(" ").append(answer % 24);
        System.out.println(sb);
    }
}
