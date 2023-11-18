import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30468 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int sum1 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += Integer.parseInt(input[i]);
        }

        int sum2 = Integer.parseInt(input[4]) * 4;

        System.out.println(Math.max(sum2 - sum1, 0));
    }
}
