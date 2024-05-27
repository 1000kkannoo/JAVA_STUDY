import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_16499 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) strings[i] = br.readLine();

        System.out.println(solution(n, strings));
    }

    private static int solution(int n, String[] strings) {
        Set<String> set = new HashSet<>();
        for (String string : strings) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            set.add(sortedString);
        }
        return set.size();
    }
}
