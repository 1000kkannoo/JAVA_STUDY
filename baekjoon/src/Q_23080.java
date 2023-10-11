import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_23080 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split("");

        sb.append(split[0]);
        int count = 1;
        for (int i = 1; i < split.length; i++) {
            if (count == n) {
                sb.append(split[i]);
                count = 0;
            }
            count++;
        }

        System.out.println(sb);
    }
}
