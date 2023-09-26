import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11655 {

    public static final char UPPER_CASE = 'Z';
    public static final char LOWER_CASE = 'z';

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                appendNotAlphabetic(sb, c);
            } else if (Character.isUpperCase(c)) {
                appendCharterWithROT13(c, UPPER_CASE, sb);
            } else {
                appendCharterWithROT13(c, LOWER_CASE, sb);
            }
        }
        return sb.toString();
    }

    private static void appendNotAlphabetic(StringBuilder sb, char c) {
        sb.append(c);
    }

    private static void appendCharterWithROT13(char c, char z, StringBuilder sb) {
        char ROT13 = (c + 13 > z) ? (char) (c - 13) : (char) (c + 13);
        sb.append(ROT13);
    }
}
