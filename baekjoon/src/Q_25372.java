import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25372 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String str = br.readLine();
            int length = str.length();
            if (length >= 6 && length <= 9) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}
