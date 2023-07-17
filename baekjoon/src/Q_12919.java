import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Q_12919 {
    static String S, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        T = br.readLine();

        System.out.println(BFS(T));
    }

    private static int BFS(String word) {
        int flag = 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(word);
        while (!queue.isEmpty()) {
            String poll = queue.poll();
            if (poll.length() >= 2 && poll.charAt(0) == 'B') {
                String nextWord = new StringBuilder(poll.substring(1)).reverse().toString();
                if (nextWord.equals(S)) return flag + 1;
                queue.offer(nextWord);
            }
            if (poll.length() >= 2 && poll.charAt(poll.length() - 1) == 'A') {
                String nextWord = poll.substring(0, poll.length() - 1);
                if (nextWord.equals(S)) return flag + 1;
                queue.offer(nextWord);
            }
        }
        return flag;
    }
}
