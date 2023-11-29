import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30007 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] split = br.readLine().split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);
            int num3 = Integer.parseInt(split[2]) - 1;

            sb.append(num1 * num3 + num2).append("\n");
        }

        System.out.println(sb);
    }
}
