import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_28490 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int answer = Integer.MIN_VALUE;
        while (T-- > 0) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            answer = Math.max(answer, a * b);
        }

        System.out.println(answer);
    }
}
