import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2711 {
    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());

            String str = st.nextToken();
            String change = sb.append(str).deleteCharAt(a - 1).toString();
            answer.append(change).append("\n");
        }

        System.out.println(answer);
    }
}
