import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30793 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        System.out.println(solution(n, m));
    }

    private static String solution(int n, int m) {
        double value = (double) n / m;
        if (value < 0.2) {
            return "weak";
        } else if (value < 0.4) {
            return "normal";
        } else if (value < 0.6) {
            return "strong";
        }
        return "very strong";
    }
}
