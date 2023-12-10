import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_26545 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int answer = 0;
        while (T --> 0) {
            answer += Integer.parseInt(br.readLine());
        }

        System.out.println(answer);
    }
}
