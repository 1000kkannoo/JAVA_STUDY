import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_9316 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            sb.append("Hello World, Judge ").append(i).append("!\n");
        }

        System.out.println(sb);
    }
}
