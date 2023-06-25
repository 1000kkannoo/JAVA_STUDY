import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Q_4344 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());

            int sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[j] = value;
                sum += value;
            }

            double avg = sum / (double) n;
            double count = 0;
            for (int num : arr) if (num > avg) count++;

            sb.append(String.format("%.3f%%\n", (count / n) * 100));
        }

        System.out.println(sb);
    }
}
