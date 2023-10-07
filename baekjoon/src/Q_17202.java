import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_17202 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num1 = br.readLine().split("");
        String[] num2 = br.readLine().split("");

        for (int i = 0; i < num1.length; i++) {
            sb.append(num1[i]).append(num2[i]);
        }
        String number = sb.toString();

        while (number.length() != 2) {
            sb.setLength(0);
            String[] split = number.split("");
            for (int i = 0; i < split.length - 1; i++) {
                Integer n = (Integer.parseInt(split[i]) + Integer.parseInt(split[i + 1])) % 10;
                sb.append(n);
            }
            number = sb.toString();
        }

        System.out.println(number);
    }
}
