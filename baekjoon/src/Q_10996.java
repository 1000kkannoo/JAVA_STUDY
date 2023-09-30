import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10996 {
    private static Integer NUMBER;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NUMBER = Integer.parseInt(br.readLine());

        int count = NUMBER * 2;
        for (int i = 1; i <= count; i++) {
            addSettingStar(sb, i % 2 != 0);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void addSettingStar(StringBuilder sb, boolean isOdd) {
        String add1, add2;
        if (isOdd) {
            add1 = "*";
            add2 = " ";
        } else {
            add1 = " ";
            add2 = "*";
        }
        add(sb, add1, add2);
    }

    private static void add(StringBuilder sb, String add1, String add2) {
        for (int j = 1; j <= NUMBER; j++) {
            if (j % 2 != 0) {
                sb.append(add1);
            } else {
                sb.append(add2);
            }
        }
    }
}
