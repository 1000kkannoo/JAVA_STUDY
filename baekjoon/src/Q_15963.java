import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15963 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        if (split[0].equals(split[1])) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
