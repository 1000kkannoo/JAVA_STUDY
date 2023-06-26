import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());
        String answer;

        if (first == 1) {
            answer = "ascending";
            for (int i = 2; i <= 8; i++) {
                int check = Integer.parseInt(st.nextToken());
                if (check != i) {
                    answer = "mixed";
                    break;
                }
            }
        } else if (first == 8){
            answer = "descending";
            for (int i = 7; i >= 1; i--) {
                int check = Integer.parseInt(st.nextToken());
                if (check != i) {
                    answer = "mixed";
                    break;
                }
            }
        } else answer = "mixed";

        System.out.println(answer);
    }
}
