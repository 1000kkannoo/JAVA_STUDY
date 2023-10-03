import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11170 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);

            int sum = 0;
            for (int i = n; i <= m; i++) {
                sum += getCountOfZeros(i);
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

    private static long getCountOfZeros(int i) {
        String strNum = String.valueOf(i);
        return strNum.chars().filter(ch -> ch == '0').count();
    }
}
