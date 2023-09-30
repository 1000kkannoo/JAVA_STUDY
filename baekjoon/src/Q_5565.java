import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5565 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumPrice = Integer.parseInt(br.readLine());
        System.out.println(getRealSumPrice(br, sumPrice));
    }

    private static Integer getRealSumPrice(BufferedReader br, int sumPrice) throws IOException {
        int price = 0;
        for (int i = 0; i < 9; i++) {
            price += Integer.parseInt(br.readLine());
        }

        return sumPrice - price;
    }
}
