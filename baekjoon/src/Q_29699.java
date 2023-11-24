import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_29699 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "WelcomeToSMUPC";
        int n = Integer.parseInt(br.readLine()) % 14;

        char answer = (n == 0) ? str.charAt(13) : str.charAt(n - 1);
        System.out.println(answer);
    }
}
