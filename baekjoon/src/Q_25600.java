import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25600 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int answer = 0;

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int d = Integer.parseInt(split[1]);
            int g = Integer.parseInt(split[2]);

            int score = a * (d + g);
            if (a == d + g) {
                score *= 2;
            }

            if (score > answer) {
                answer = score;
            }
        }

        System.out.println(answer);
    }
}
