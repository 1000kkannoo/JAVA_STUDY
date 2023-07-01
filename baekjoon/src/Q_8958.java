import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_8958 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int sum = 0;
            int count = 1;
            for (char ch : str.toCharArray()) {
                if (ch == 'O') sum += count++;
                else count = 1;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
