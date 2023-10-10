import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15351 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            char[] chars = br.readLine().toCharArray();
            int sum = 0;
            for (char ch : chars) {
                if (Character.isAlphabetic(ch)) {
                    int n = ((int) ch) - 64;
                    sum += n;
                }
            }

             sb.append((sum == 100) ? "PERFECT LIFE" : sum)
                    .append("\n");
        }

        System.out.println(sb);
    }
}
