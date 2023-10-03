import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_13752 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append("=".repeat(n)).append("\n");
        }

        System.out.println(sb);
    }
}
