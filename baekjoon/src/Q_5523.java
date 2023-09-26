import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5523 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(br, n));
    }

    private static String solution(BufferedReader br, int n) throws IOException {
        int winA = 0;
        int winB = 0;
        while (n --> 0) {
            String[] split = br.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            if (A > B) {
                winA++;
            } else if (B > A){
                winB++;
            }
        }
        return winA + " " + winB;
    }
}
