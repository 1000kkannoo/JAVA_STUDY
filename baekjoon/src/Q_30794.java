import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30794 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int lv = Integer.parseInt(split[0]);
        String check = split[1];

        System.out.println(solution(lv, check));
    }

    private static int solution(int lv, String check) {
        if (check.equals("bad")) {
            return lv * 200;
        } else if (check.equals("cool")) {
            return lv * 400;
        } else if (check.equals("great")) {
            return lv * 600;
        } else if (check.equals("perfect")) {
            return lv * 1000;
        }
        return 0;
    }
}
