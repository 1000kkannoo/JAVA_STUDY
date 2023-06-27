import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1158 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);

        while (queue.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                int turn = queue.poll();
                queue.offer(turn);
            }
            int save = queue.poll();
            sb.append(save).append(",").append(" ");
        }

        sb.append(queue.poll()).append(">");

        System.out.println(sb);
    }
}
