import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Q_23348 {
    private static Integer MAX_VALUE = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] levels = br.readLine().split(" ");

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                String[] scores = br.readLine().split(" ");
                for (int j = 0; j < 3; j++) {
                    int level = Integer.parseInt(levels[j]);
                    int count = Integer.parseInt(scores[j]);
                    sum += (level * count);
                }
            }
            MAX_VALUE = Math.max(MAX_VALUE, sum);
        }

        System.out.println(MAX_VALUE);
    }
}
