import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10991 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int space = N - 1;

        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(space--));
            for (int j = 1; j <= i; j++) {
                sb.append("*").append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
