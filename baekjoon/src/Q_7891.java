import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_7891 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            BigInteger num1 = new BigInteger(split[0]);
            BigInteger num2 = new BigInteger(split[1]);

            sb.append(num1.add(num2)).append("\n");
        }

        System.out.println(sb);
    }
}
