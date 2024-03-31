import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q_10815_복습 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nTokens = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        for (String token : nTokens) {
            set.add(Integer.parseInt(token));
        }

        int m = Integer.parseInt(br.readLine());
        String[] mTokens = br.readLine().split(" ");

        for (String token : mTokens) {
            int num = Integer.parseInt(token);
            if (set.contains(num)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
