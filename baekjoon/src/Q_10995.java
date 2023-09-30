import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10995 {
    private static Integer NUMBER;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NUMBER = Integer.parseInt(br.readLine());
        System.out.println(solution());
    }

    private static String solution() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= NUMBER; i++) {
            if (i % 2 != 0) {
                addStringBuilder(sb, "*", " ");
            } else {
                addStringBuilder(sb, " ", "*");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private static void addStringBuilder(StringBuilder sb, String add1, String add2) {
        for (int j = 1; j <= NUMBER; j++) {
            sb.append(add1).append(add2);
        }
    }
}
