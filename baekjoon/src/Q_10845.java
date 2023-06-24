import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_10845 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String f = br.readLine();
            if (f.contains("push")) {
                StringTokenizer st = new StringTokenizer(f, " ");
                st.nextToken();
                queue.offer(Integer.parseInt(st.nextToken()));
            } else if (f.contains("pop")) {
                int num = (queue.isEmpty()) ? -1 : queue.poll();
                sb.append(num).append("\n");
            } else if (f.contains("size")) {
                sb.append(queue.size()).append("\n");
            } else if (f.contains("empty")) {
                int num = (queue.isEmpty()) ? 1 : 0;
                sb.append(num).append("\n");
            } else if (f.contains("front")) {
                int num = (queue.isEmpty()) ? -1 : queue.peek();
                sb.append(num).append("\n");
            } else if (f.contains("back")) {
                int num = (queue.isEmpty()) ? -1 : ((LinkedList<Integer>) queue).getLast();
                sb.append(num).append("\n");
            } else throw new IllegalArgumentException();
        }
        System.out.println(sb);
    }
}