import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_4714 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            double v = Double.parseDouble(br.readLine());
            if (v < 0) {
                break;
            }
            String format = String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.", v, v * 0.167);
            sb.append(format).append("\n");
        }
        System.out.println(sb);
    }
}
