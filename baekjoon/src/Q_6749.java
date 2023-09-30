import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_6749 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int numAbs = Math.abs(num1 - num2);
        if (num1 > num2) {
            System.out.println(num1 + numAbs);
        } else {
            System.out.println(num2 + numAbs);
        }
    }
}
