import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10822 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(",");
        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
