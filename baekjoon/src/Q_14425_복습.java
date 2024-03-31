import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q_14425_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int answer = 0;
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
