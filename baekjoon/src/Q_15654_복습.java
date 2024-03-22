import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_15654_복습 {
    static int n, m;
    static int[] print, arr, ch;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];
        ch = new int[10001];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        DFS(0);

        System.out.println(sb);
    }

    private static void DFS(int i) {
        if (i == m) {
            for (int num : print) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = 0; j < n; j++) {
                if (ch[arr[j]] == 0) {
                    ch[arr[j]] = 1;
                    print[i] = arr[j];
                    DFS(i + 1);
                    ch[arr[j]] = 0;
                }
            }
        }
    }
}
