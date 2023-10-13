import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15059 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String[] split1 = br.readLine().split(" ");
        String[] split2 = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            int possible = Integer.parseInt(split1[i]);
            int want = Integer.parseInt(split2[i]);
            if (want > possible) {
                sum += want-possible;
            }
        }

        System.out.println(sum);
    }
}
