import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_26082 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);
        int performance = (B / A) * 3 * C;

        System.out.println(performance);
    }
}
