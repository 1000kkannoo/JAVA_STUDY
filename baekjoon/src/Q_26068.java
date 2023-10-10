import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_26068 {
    private static final int VALUE = 90;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine().substring(2);
            int number = Integer.parseInt(str);
            if (VALUE >= number) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
