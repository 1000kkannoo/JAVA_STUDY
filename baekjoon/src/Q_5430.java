import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5430 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String functions = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String list = br.readLine();

            for (char function : functions.toCharArray()) {
                if (function == 'R') {
                    char[] chars = list.toCharArray();
                    int lt = 0;
                    for (int rt = chars.length - 1; lt != rt; lt++, rt--) {
                        if (Character.isDigit(chars[lt])) {
                            char temp = chars[lt];
                            chars[lt] = chars[rt];
                            chars[rt] = temp;
                        }
                    }
                    list = String.valueOf(chars);
                } else {
                    if (list.length() == 2) {
                        list = "error";
                        continue;
                    }
                }
            }
            sb.append(list).append("\n");
        }
        System.out.println(sb);
    }
}
