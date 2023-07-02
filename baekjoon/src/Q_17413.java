import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_17413 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean reverse = true;

        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                if (reverse) {
                    sb.append(word.reverse());
                    word.setLength(0);
                }
                reverse = false;
                sb.append(ch);
            } else if (ch == '>') {
                reverse = true;
                sb.append(ch);
            } else if (reverse && ch != ' ') {
                word.append(ch);
            } else if (reverse && ch == ' ') {
                sb.append(word.reverse());
                sb.append(ch);
                word.setLength(0);
            } else {
                sb.append(ch);
            }
        }

        if (word.length() != 0) sb.append(word.reverse().toString());

        System.out.println(sb);
    }
}
