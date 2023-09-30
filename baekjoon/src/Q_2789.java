import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2789 {
    private static final String CONTAINS = "CAMBRIDGE";

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");

        for (String s : word) {
            if (!CONTAINS.contains(s)) {
                sb.append(s);
            }
        }

        System.out.println(sb);
    }
}
