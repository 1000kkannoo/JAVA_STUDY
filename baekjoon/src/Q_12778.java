import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_12778 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            String command = split[1];
            String[] words = br.readLine().split(" ");
            for (String word : words) {
                if (command.equals("C")) {
                    sb.append(word.charAt(0) - 64).append(" ");
                } else {
                    sb.append((char) (Integer.parseInt(word) + 64)).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
