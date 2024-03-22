import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_15655 {
    static int n, m;
    static int[] print, arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        print = new int[m];

        DFS(0, 0);

        System.out.println(sb);
    }

    private static void DFS(int i, int index) {
        if (i == m) {
            for (int num : print) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        } else {
            for (int j = index; j < n; j++) {
                print[i] = arr[j];
                DFS(i + 1, j + 1);
            }
        }
    }
}
