import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_9295 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String[] split = br.readLine().split(" ");
            appendSum(sb, i, split);
        }

        System.out.println(sb);
    }

    private static void appendSum(StringBuilder sb, int i, String[] split) {
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        sb.append("Case ").append(i).append(": ").append(x + y).append("\n");
    }
}
