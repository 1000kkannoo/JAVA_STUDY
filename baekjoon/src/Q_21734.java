import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_21734 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        for (char ch : chars) {
            String[] nums = String.valueOf((int) ch).split("");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            sb.append(String.valueOf(ch).repeat(sum)).append("\n");
        }

        System.out.println(sb);
    }
}
