import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11098 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int max = Integer.MIN_VALUE;
            String maxName = "";
            int p = Integer.parseInt(br.readLine());
            for (int i = 0; i < p; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int c = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if (c > max) {
                    max = c;
                    maxName = name;
                }
            }
            sb.append(maxName).append("\n");
        }

        System.out.println(sb);
    }
}
