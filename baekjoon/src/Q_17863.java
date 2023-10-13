import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_17863 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.startsWith("555")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
