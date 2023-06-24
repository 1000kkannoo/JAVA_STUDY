import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_10866 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String f = br.readLine();
            if (f.contains("push_back")) {
                StringTokenizer st = new StringTokenizer(f, " ");
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (f.contains("push_front")) {
                StringTokenizer st = new StringTokenizer(f, " ");
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (f.equals("pop_front")) {
                int num = (deque.isEmpty()) ? -1 : deque.pollFirst();
                sb.append(num).append("\n");
            } else if (f.equals("pop_back")) {
                int num = (deque.isEmpty()) ? -1 : deque.pollLast();
                sb.append(num).append("\n");
            } else if (f.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (f.equals("empty")) {
                int num = (deque.isEmpty()) ? 1 : 0;
                sb.append(num).append("\n");
            } else if (f.equals("front")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekFirst()).append("\n");
            } else if (f.equals("back")) {
                if (deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
            } else {
                throw new IllegalArgumentException();
            }
        }
        System.out.println(sb);
    }
}
