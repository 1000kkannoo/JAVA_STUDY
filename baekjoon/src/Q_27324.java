import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_27324 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        System.out.println(solution(numbers));
    }

    private static int solution(String numbers) {
        char[] chars = numbers.toCharArray();
        if (chars[0] == chars[1]) {
            return 1;
        }
        return 0;
    }
}
