import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23037 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");

        int answer = 0;
        for (String strNum : split) {
            int num = Integer.parseInt(strNum);
            answer += (int) Math.pow(num, 5);
        }

        System.out.println(answer);
    }
}
