import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14405 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("pi|ka|chu", "");

        if (str.length() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
