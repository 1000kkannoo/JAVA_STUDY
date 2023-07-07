import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10804 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[21];
        for (int i = 1; i <= 20; i++) arr[i] = i;

        int T = 10;
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int lt = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());

            while (lt < rt) {
                int temp = arr[lt];
                arr[lt++] = arr[rt];
                arr[rt--] = temp;
            }
        }

        for (int i = 1; i <= 20; i++) sb.append(arr[i]).append(" ");
        System.out.println(sb);
    }
}
