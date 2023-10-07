import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_13235 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
