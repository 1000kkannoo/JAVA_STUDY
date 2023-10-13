import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_21598 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("SciComLove").append("\n");
        }

        System.out.println(sb);
    }
}
