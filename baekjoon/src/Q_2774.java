import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q_2774 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        System.out.println(solution(br, T));
    }

    private static String solution(BufferedReader br, int T) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            Set<Character> set = new HashSet<>();
            char[] charArray = br.readLine().toCharArray();
            for (char c : charArray) {
                set.add(c);
            }
            sb.append(set.size()).append("\n");
        }

        return sb.toString();
    }
}
