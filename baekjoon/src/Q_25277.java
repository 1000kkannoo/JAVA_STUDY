import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25277 {
    static final String[] WORDS = new String[]{"he", "she", "him", "her"};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int answer = 0;
        for (String s : split) {
            for (String word : WORDS) {
                if (s.equals(word)) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
