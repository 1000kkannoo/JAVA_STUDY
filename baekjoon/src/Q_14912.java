import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14912 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            for (String s : str.split("")) {
                if (s.equals(String.valueOf(m))) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
