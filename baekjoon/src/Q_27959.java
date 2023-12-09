import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_27959 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = 100 * Integer.parseInt(split[0]);
        if (n >= Integer.parseInt(split[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
