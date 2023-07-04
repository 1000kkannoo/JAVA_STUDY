import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_9613 {
    static int n;
    static long answer;
    static int[] arr, sum;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());

            arr = new int[n];
            sum = new int[2];
            answer = 0;

            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            DFS(0, 0);
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }

    private static void DFS(int i, int k) {
        if (i == 2) {
            int gcd = GCD(sum[0], sum[1]);
            answer += gcd;
        } else {
            for (int j = k; j < arr.length; j++) {
                sum[i] = arr[j];
                DFS(i + 1, j + 1);
            }
        }
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
