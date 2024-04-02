import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q_11279_복습 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (priorityQueue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(priorityQueue.poll()).append("\n");
                }
            } else {
                priorityQueue.offer(n);
            }
        }

        System.out.println(sb);
    }
}
