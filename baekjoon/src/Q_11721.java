import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11721 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String s : input.split("")) {
            count++;
            sb.append(s);
            if (count == 10) {
                sb.append("\n");
                count = 0;
            }
        }
        return sb.toString();
    }
}
