import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30031 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        while (T-- > 0) {
            String[] split = br.readLine().split(" ");
            if (split[0].equals("136")) {
                sum += 1000;
            } else if (split[0].equals("142")) {
                sum += 5000;
            } else if (split[0].equals("148")) {
                sum += 10000;
            } else if (split[0].equals("154")) {
                sum += 50000;
            }
        }
        System.out.println(sum);
    }
}
