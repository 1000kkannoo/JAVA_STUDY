import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_27267 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);

        System.out.println(solution(a, b, c, d));
    }

    private static String solution(int a, int b, int c, int d) {
        int masha = a * b;
        int pet = c * d;

        if (masha > pet) {
            return "M";
        } else if (masha < pet) {
            return "P";
        }
        return "E";
    }
}
