import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10599 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] split = br.readLine().split(" ");
            if (isBreak(split)) break;

            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);
            int d = Integer.parseInt(split[3]);

            sb.append(Math.min(c, d) - Math.max(a, b))
                    .append(" ")
                    .append(Math.max(c, d) - Math.min(a, b))
                    .append("\n");
        }

        System.out.println(sb);
    }

    private static boolean isBreak(String[] split) {
        return split[0].equals("0") && split[1].equals("0") && split[2].equals("0") && split[3].equals("0");
    }
}
