import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_17350 {

    public static final String NAME = "anj";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String answer = "뭐야?";

        while (T --> 0) {
            String s = br.readLine();
            if (s.equals(NAME)) {
                answer = "뭐야;";
            }
        }

        System.out.println(answer);
    }}
