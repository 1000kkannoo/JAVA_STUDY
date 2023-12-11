import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25625 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);

        if (A > B) {
            System.out.println(A + B);
        } else {
            System.out.println(B - A);
        }
    }
}
