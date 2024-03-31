import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q_1920_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> getHashSet = getFirstInput(br);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int foundNum = Integer.parseInt(st.nextToken());
            if (getHashSet.contains(foundNum)) {
                sb.append(1).append("\n");
                continue;
            }
            sb.append(0).append("\n");
        }

        System.out.println(sb);
    }

    private static HashSet<Integer> getFirstInput(BufferedReader br) throws IOException {
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        return set;
    }
}
