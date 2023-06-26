import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < m; i++) {
            String search = br.readLine();
            int flag = Arrays.binarySearch(arr, search);
            if (flag >= 0) count++;
        }

        System.out.println(count);
    }
}
