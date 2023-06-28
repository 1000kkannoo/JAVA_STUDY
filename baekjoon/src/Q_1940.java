import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int count = 0;
        int lt = 0;
        for (int rt = arr.length - 1; lt < rt;) {
            if (arr[lt] + arr[rt] == m) {
                count++;
                lt++;
            }
            else if (arr[lt] + arr[rt] < m) lt++;
            else if (arr[lt] + arr[rt] > m) rt--;
        }

        System.out.println(count);
    }
}
