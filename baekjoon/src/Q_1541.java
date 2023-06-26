import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String fun = br.readLine();

        boolean minus = false;
        int answer = 0;
        char[] charArray = fun.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (i == charArray.length - 1) {
                sb.append(ch);
                if (minus) answer -= Integer.parseInt(sb.toString());
                else answer += Integer.parseInt(sb.toString());
            }

            if (Character.isDigit(ch)) sb.append(ch);
            else {
                if (minus) answer -= Integer.parseInt(sb.toString());
                else answer += Integer.parseInt(sb.toString());

                if (!minus && ch == '-') minus = true;

                sb.setLength(0);
            }
        }

        System.out.println(answer);
    }
}
