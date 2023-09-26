import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_18406 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static String solution(String input) {
        int mid = input.length() / 2;
        String firstHalf = input.substring(0, mid);
        String secondHalf = input.substring(mid);

        int a = getSum(firstHalf);
        int b = getSum(secondHalf);

        return (a == b) ? "LUCKY" : "READY";
    }

    private static int getSum(String half) {
        int num = 0;
        for (String numStr : half.split("")) {
            num += Integer.parseInt(numStr);
        }
        return num;
    }
}
