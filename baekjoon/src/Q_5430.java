import javax.naming.spi.DirObjectFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_5430 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            Deque<String> deque = new LinkedList<>();

            String functions = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String numList = br.readLine();
            numList = numList.substring(1, numList.length() - 1);

            st = new StringTokenizer(numList, ",");

            for (int j = 0; j < n; j++) deque.add(st.nextToken());

            boolean isReverse = false;
            boolean isError = false;
            for (char ch : functions.toCharArray()) {
                if (ch == 'R') isReverse = !isReverse;
                else {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReverse) deque.pollLast();
                    else deque.pollFirst();
                }
            }

            if (isError) sb.append("error").append("\n");
            else {
                sb.append("[");
                if (isReverse) {
                    while (deque.size() > 1) {
                        sb.append(deque.pollLast()).append(",");
                    }
                } else {
                    while (deque.size() > 1) {
                        sb.append(deque.pollFirst()).append(",");
                    }
                }
                if (deque.size() != 0) sb.append(deque.getFirst());
                sb.append("]").append("\n");
            }
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
