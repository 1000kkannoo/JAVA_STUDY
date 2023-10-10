import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10797 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (String s : br.readLine().split(" ")) {
            if (n == Integer.parseInt(s)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
