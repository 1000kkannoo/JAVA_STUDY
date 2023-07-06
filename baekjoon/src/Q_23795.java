import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_23795 {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(br.readLine());
            if (a == -1) break;
            sum += a;
        }

        System.out.println(sum);
    }
}
