import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_17010 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int number = Integer.parseInt(split[0]);
            String word = split[1];

            sb.append(word.repeat(number)).append("\n");
        }

        System.out.println(sb);
    }
}
