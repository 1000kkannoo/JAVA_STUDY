import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Q_11478 {
    static char[] chars;
    static HashSet<String> set;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        set = new HashSet<>();
        String word = br.readLine();
        chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            sb = new StringBuilder();
            sb.append(chars[i]);
            set.add(sb.toString());
            DFS(i + 1);
        }

        System.out.println(set.size());
    }

    private static void DFS(int i) {
        for (int j = i; j < chars.length; j++) {
            sb.append(chars[j]);
            set.add(sb.toString());
        }
    }
}
