import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine().toLowerCase();
            if (str.equals("#")) break;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
