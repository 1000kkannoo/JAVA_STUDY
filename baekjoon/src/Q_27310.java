import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_27310 {

    public static final int COLON = 2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = s.length() + COLON;
        for (char c : s.toCharArray()) {
            if (c == '_') sum += 5;
        }
        System.out.println(sum);
    }
}
