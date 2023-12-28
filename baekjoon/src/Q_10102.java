import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10102 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int A = 0, B = 0;

        for (char c : str.toCharArray()) {
            if (c == 'A') {
                A++;
            } else if (c == 'B') {
                B++;
            }
        }

        String answer = "Tie";
        if (A > B) {
            answer = "A";
        } else if (A < B) {
            answer = "B";
        }
        System.out.println(answer);
    }
}
