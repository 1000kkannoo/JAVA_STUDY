import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_21318 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] ch = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = 0;
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > arr[i + 1]) num++;
            ch[i] = num;
        }

        int q = Integer.parseInt(br.readLine());

        while (q-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int val = ch[y - 1] - ch[x - 1];
            sb.append(val).append("\n");
        }

        System.out.println(sb);
    }
}
