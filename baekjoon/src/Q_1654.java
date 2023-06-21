import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long lt = 1;
        long rt = max;
        while (lt <= rt) {
            int sum = 0;
            long half = (lt + rt) / 2;

            for (int num : arr) sum += num / half;

            if (sum < m) rt = half - 1;
            else lt = half + 1;
        }

        System.out.println(rt);
    }
}
