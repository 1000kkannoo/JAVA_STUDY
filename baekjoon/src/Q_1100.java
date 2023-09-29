import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1100 {

    public static final int CHASE_BOARD_SIZE = 8;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 1; i <= CHASE_BOARD_SIZE; i++) {
            String[] split = br.readLine().split("");
            for (int j = 1; j <= CHASE_BOARD_SIZE; j++) {
                String chase = split[j - 1];
                if (chase.equals("F")) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        count++;
                    } else if (i % 2 != 0 && j % 2 != 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
