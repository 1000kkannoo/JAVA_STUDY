import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String number = br.readLine();
            if (number.equals("0")) break;

            char[] numbers = number.toCharArray();
            int lt = 0;
            boolean isTrue = true;

            if (numbers[0] == '0') isTrue = false;
            else {
                for (int rt = number.length() - 1; lt < rt; lt++, rt--) {
                    if (numbers[lt] != numbers[rt]) {
                        isTrue = false;
                        break;
                    }
                }
            }

            if (isTrue) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
