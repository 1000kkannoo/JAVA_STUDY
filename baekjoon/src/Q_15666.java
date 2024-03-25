import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q_15666 {
    static int n, m;
    static int[] arr, print;
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

        DFS(0, 0);
        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void DFS(int depth, int index) {
        if (depth == m) {
            for (int n : print) {
                sb.append(n).append(" ");
            }
            set.add(sb.toString());
            sb.setLength(0);
        } else {
            for (int i = index; i < n; i++) {
                print[depth] = arr[i];
                DFS(depth + 1, i);
            }
        }
    }
}
