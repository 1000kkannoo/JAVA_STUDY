import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] type = new int[n];
        for (int i = n - 1; i >= 0; i--) type[i] = Integer.parseInt(br.readLine());

        int count = 0;
        for (int num : type) {
            if (k == 0) break;
            while (k >= num) {
                k -= num;
                count++;
            }
        }
        System.out.println(count);
    }
}
