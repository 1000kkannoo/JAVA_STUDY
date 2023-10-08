import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        while (true) {
            i++;
            if (n == 1) break;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
        }

        System.out.println(i);
    }
}
