import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_11866_복습 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("<");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            Integer poll = queue.poll();
            if (count == k) {
                sb.append(poll).append(", ");
                count = 0;
                continue;
            }
            queue.offer(poll);
        }

        sb.delete(sb.length() - 2, sb.length()).append(">");

        System.out.println(sb);
    }
}
