import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2902 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("-");
        for (String s : split) {
            sb.append(s.charAt(0));
        }

        System.out.println(sb);
    }
}
