import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5357 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String str = br.readLine();
            char target = ' ';
            for (char c : str.toCharArray()) {
                if (target != c) {
                    target = c;
                    sb.append(c);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
