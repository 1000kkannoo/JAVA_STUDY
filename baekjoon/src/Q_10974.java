import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10974 {
    static StringBuilder sb;
    static int[] ch, nums;
    static int n;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        ch = new int[n + 1];
        nums = new int[n + 1];

        DFS(1);

        System.out.println(sb);
    }

    private static void DFS(int i) {
        if (i > n) {
            for (int j = 1; j <= n; j++) {
                sb.append(nums[j]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = 1; j <= n; j++) {
                if (ch[j] == 0) {
                    nums[i] = j;
                    ch[j] = 1;
                    DFS(i + 1);
                    ch[j] = 0;
                }
            }
        }
    }
}
