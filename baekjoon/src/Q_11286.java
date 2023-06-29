import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q_11286 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>((x, y) -> {
                    if (Math.abs(x) == Math.abs(y)) return x - y;
                    return Math.abs(x) - Math.abs(y);
                }
        );

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                int num = (pQ.isEmpty()) ? 0 : pQ.poll();
                sb.append(num).append("\n");
            } else {
                pQ.offer(a);
            }
        }

        System.out.println(sb);
    }
}
