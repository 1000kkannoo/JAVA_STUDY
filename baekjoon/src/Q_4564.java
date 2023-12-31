import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_4564 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;

            sb.append(num).append(" ");
            while (num > 9) {
                String[] split = String.valueOf(num).split("");
                int sum = 1;
                for (String s : split) {
                    sum *= Integer.parseInt(s);
                }
                sb.append(sum).append(" ");
                num = sum;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
