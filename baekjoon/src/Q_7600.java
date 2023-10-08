import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q_7600 {
    public static void main(String[] args) throws Exception {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("#")) break;
            for (char ch : str.toCharArray()) {
                if (Character.isAlphabetic(ch) && ch != ' ') {
                    set.add(Character.toLowerCase(ch));
                }
            }
            sb.append(set.size()).append("\n");
            set.clear();
        }
        System.out.println(sb);
    }
}
