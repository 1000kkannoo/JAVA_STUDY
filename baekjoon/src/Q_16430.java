import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_16430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        System.out.println(m - n + " " + m);
    }
}
