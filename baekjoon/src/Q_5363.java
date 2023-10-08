import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5363 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            for (int i = 2; i < split.length; i++) {
                sb.append(split[i]).append(" ");
            }
            sb.append(split[0]).append(" ").append(split[1]).append("\n");
        }

        System.out.println(sb);
    }
}
