import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_9085 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] split = br.readLine().split(" ");
            int sum = 0;
            for (String s : split) {
                sum += Integer.parseInt(s);
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
