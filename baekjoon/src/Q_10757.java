import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine().split(" ")));
    }

    private static BigInteger solution(String[] s) {
        BigInteger num1 = new BigInteger(s[0]);
        BigInteger num2 = new BigInteger(s[1]);

        return num1.add(num2);
    }
}
