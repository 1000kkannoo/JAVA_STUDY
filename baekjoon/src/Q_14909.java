import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14909 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int sum = 0;
        for (String s : split) {
            int num = Integer.parseInt(s);
            if (num > 0) sum++;
        }

        System.out.println(sum);
    }
}
