import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n <= 5) System.out.println(1);
        else if (n % 5 != 0) System.out.println(n / 5 + 1);
        else System.out.println(n / 5);
    }
}
