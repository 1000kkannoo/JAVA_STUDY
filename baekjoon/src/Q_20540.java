import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class Q_20540 {
    private final static Map<Character, Character> MBTI =
            Map.of('E', 'I', 'I', 'E', 'N', 'S', 'S', 'N', 'F', 'T', 'T', 'F', 'P', 'J', 'J', 'P');

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(getMyPartner(s));
    }

    private static String getMyPartner(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(MBTI.get(c));
        }
        return sb.toString();
    }
}
