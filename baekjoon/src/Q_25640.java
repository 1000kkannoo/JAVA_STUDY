import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25640 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int T = Integer.parseInt(br.readLine());

        int sum = 0;
        while (T --> 0) {
            String friend = br.readLine();
            if (mbti.equals(friend)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
