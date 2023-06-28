import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_11866 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) queue.offer(i);

        sb.append("<");
        while (queue.size() > 1) {
            for (int i = 0; i < m - 1; i++) queue.offer(queue.poll());
            sb.append(queue.poll()).append(",").append(" ");
        }
        sb.append(queue.poll());
        sb.append(">");

        System.out.println(sb);
    }
}
