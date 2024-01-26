import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_13484 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int data = Integer.parseInt(br.readLine());
            sum += X - data;
        }
        System.out.println(X + sum);
    }
}
