import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5717 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] split = br.readLine().split(" ");
            if (split[0].equals("0") && split[1].equals("0")) {
                break;
            }
            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);
            sb.append(n + m).append("\n");
        }

        System.out.println(sb);
    }
}
