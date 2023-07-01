import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2693 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[arr.length - 3]).append("\n");
        }
        System.out.println(sb);
    }
}
