import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2741 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) sb.append(i).append("\n");

        System.out.println(sb);

    }
}
