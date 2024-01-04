import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2864 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        String originalNum1 = split[0];
        String originalNum2 = split[1];

        String maxNum1 = originalNum1.replace("5", "6");
        String maxNum2 = originalNum2.replace("5", "6");
        int maxSum = Integer.parseInt(maxNum1) + Integer.parseInt(maxNum2);

        String minNum1 = originalNum1.replace("6", "5");
        String minNum2 = originalNum2.replace("6", "5");
        int minSum = Integer.parseInt(minNum1) + Integer.parseInt(minNum2);

        System.out.printf("%d %d", minSum, maxSum);
    }
}
