import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15232 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("*".repeat(m)).append("\n");
        }

        System.out.println(sb);
    }
}
