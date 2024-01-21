import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10569 {
    public static void main(String[] args) throws Exception {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int result = Math.abs(a - b) + 2;
            answer.append(result).append("\n");
        }

        System.out.println(answer);
    }
}
