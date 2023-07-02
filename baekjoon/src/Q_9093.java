import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_9093 {
    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String str = br.readLine();
            String[] split = str.split(" ");
            for (String s : split) {
                answer.append(sb.append(s).reverse().append(" "));
                sb.setLength(0);
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
