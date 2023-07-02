import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());

        int[] money = {500, 100, 50, 10, 5, 1};
        int sum = 1000 - price;
        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (sum == 0) break;
            if (sum >= money[i]) {
                count += sum / money[i];
                sum %= money[i];
            }
        }

        System.out.println(count);
    }
}
