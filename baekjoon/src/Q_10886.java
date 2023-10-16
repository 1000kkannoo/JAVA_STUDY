import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10886 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cute = 0, notCute = 0;
        for (int i = 0; i < n; i++) {
            int count = Integer.parseInt(br.readLine());
            if (count == 0) {
                notCute++;
            } else {
                cute++;
            }
        }

        System.out.println((cute > notCute) ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
