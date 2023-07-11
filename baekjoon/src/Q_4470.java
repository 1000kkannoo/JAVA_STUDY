import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4470 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            sb.append(i).append(".").append(" ").append(str).append("\n");
        }
        System.out.println(sb);
    }
}
