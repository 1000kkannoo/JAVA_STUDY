import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14489 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long A = Long.parseLong(split[0]);
        long B = Long.parseLong(split[1]);
        long price = Long.parseLong(br.readLine());

        System.out.println(solution(A, B, price));
    }

    private static Long solution(long a, long b, long price) {
        long priceDouble = price + price;

        if (a + b >= priceDouble) {
            return (a + b) - priceDouble;
        }

        return a + b;
    }

}
