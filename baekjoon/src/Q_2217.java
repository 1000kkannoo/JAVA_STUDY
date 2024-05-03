import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;
        for (int i = 0, j = n; i < n; i++, j--) {
            max = Math.max(max, arr[i] * j);
        }

        System.out.println(max);
    }
}
