import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15680 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String answer = (n == 0) ? "YONSEI" : "Leading the Way to the Future";
        System.out.println(answer);
    }
}
