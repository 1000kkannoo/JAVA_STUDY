import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_15654 {
    static StringBuilder sb;
    static int n, m;
    static int[] arr, answer, ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        sb = new StringBuilder();
        answer = new int[m];
        ch = new int[10001];
        DFS(0);

        System.out.println(sb);
    }

    private static void DFS(int index) {
        if (index == m) {
            for (int n : answer) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[arr[i]] == 0) {
                    ch[arr[i]] = 1;
                    answer[index] = arr[i];
                    DFS(index + 1);
                    ch[arr[i]] = 0;
                }
            }
        }
    }
}
