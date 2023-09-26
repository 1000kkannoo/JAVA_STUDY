import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_7567 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static Integer solution(String s) {
        int sum = 10;
        char target = s.charAt(0);
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (target == charArray[i]) {
                sum += 5;
            } else {
                target = charArray[i];
                sum += 10;
            }
        }

        return sum;
    }
}
