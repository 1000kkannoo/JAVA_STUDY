import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15969 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int T = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        for (String s : split) {
            int num = Integer.parseInt(s);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        System.out.println(max - min);
    }
}
