import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int lt = 0;
        int rt = n - 1;
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum == x) {
                count++;
                rt--;
            }
            else if (sum < x) lt++;
            else rt--;
        }

        System.out.println(count);
    }
}
