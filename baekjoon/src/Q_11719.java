import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11719 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = br.readLine();
            if (str == null) break;
            else sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
