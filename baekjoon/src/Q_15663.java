import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q_15663 {
    static int n, m;
    static int[] print, arr, ch;
    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        ch = new int[n];
        DFS(0);

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void DFS(int depth) {
        if (depth == m) {
            for (int num : print) {
                sb.append(num).append(" ");
            }
            set.add(sb.toString());
            sb.setLength(0);
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    print[depth] = arr[i];
                    DFS(depth + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
