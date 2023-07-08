import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());

        long sum = 0;
        long plus = 1;
        int count = 0;

        while (sum <= s) {
            sum += plus++;
            count++;
        }

        System.out.println(count - 1);
    }
}
