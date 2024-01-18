import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_26307 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        System.out.println(solution(h, m));
    }

    private static int solution(int h, int m) {
        int minute = (h - 9) * 60;
        minute += m;
        return minute;
    }
}
