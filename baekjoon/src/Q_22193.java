import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q_22193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        BigInteger input2 = new BigInteger(br.readLine());
        BigInteger input3 = new BigInteger(br.readLine());

        System.out.println(input2.multiply(input3));
    }
}
