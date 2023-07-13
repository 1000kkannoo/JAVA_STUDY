import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i >= 1; i--) {
            sb.append("*".repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}
