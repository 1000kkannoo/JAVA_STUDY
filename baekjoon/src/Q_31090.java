import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_31090 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int year = Integer.parseInt(br.readLine());
            int nextYear = year + 1;
            int num = (year % 1000) % 100;

            if (nextYear % num == 0) {
                sb.append("Good").append("\n");
            } else {
                sb.append("Bye").append("\n");
            }
        }

        System.out.println(sb);
    }
}
