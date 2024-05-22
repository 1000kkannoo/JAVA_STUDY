import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1032 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) strings[i] = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings[0].length(); i++) {
            char c = strings[0].charAt(i);
            boolean isContains = true;
            for (int j = 1; j < strings.length; j++) {
                char search = strings[j].charAt(i);
                if (search != c) {
                    isContains = false;
                    break;
                }
            }
            if (isContains) sb.append(c);
            else sb.append("?");
        }

        System.out.println(sb);
    }
}
