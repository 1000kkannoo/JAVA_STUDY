import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_26574 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {
            String s = br.readLine();
            sb.append(s).append(" ").append(s).append("\n");
        }

        System.out.println(sb);
    }
}
