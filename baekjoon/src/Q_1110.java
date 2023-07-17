import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        if (n.equals("0")) System.out.println(1);
        else {
            String value = (Integer.parseInt(n) < 10) ? n + "0" : n;
            System.out.println(process(value, value));
        }
    }

    private static int process(String value, String result) {
        int count = 1;
        while (true) {
            char[] chars = result.toCharArray();
            String num = String.valueOf((chars[0] - '0') + (chars[1] - '0'));
            result = getResult(chars, num);

            if (value.equals(result)) break;
            else count++;
        }
        return count;
    }

    private static String getResult(char[] chars, String num) {
        StringBuilder sb = new StringBuilder();
        if (num.length() == 2) {
            sb.append(chars[1]).append(num.charAt(1));
        } else {
            sb.append(chars[1]).append(num);
        }
        return sb.toString();
    }
}
