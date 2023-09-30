import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2460 {
    private static Integer MAX_VALUE = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 10; i++) {
            String[] split = br.readLine().split(" ");
            count -= Integer.parseInt(split[0]);
            count += Integer.parseInt(split[1]);
            MAX_VALUE = (count > MAX_VALUE) ? count : MAX_VALUE;
        }

        System.out.println(MAX_VALUE);
    }
}
