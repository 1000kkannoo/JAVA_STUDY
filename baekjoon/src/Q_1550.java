import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1550 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n = Integer.parseInt(str, 16);
        System.out.println(n);
    }
}
