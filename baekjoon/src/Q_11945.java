import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11945 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            String str = br.readLine();
            answer.append(sb.append(str).reverse().toString()).append("\n");
        }

        System.out.println(answer);
    }
}
