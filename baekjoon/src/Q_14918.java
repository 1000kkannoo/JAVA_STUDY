import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14918 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long answer = 0;
        for (String s : split) {
            answer += Long.parseLong(s);
        }
        System.out.println(answer);
    }
}
