import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1697 {
    static int n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        System.out.println(BFS(n));
    }

    private static int BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        if (n == k) return 0;
        int[] ch = new int[100001];
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int j = 0; j < 3; j++) {
                int sum;
                if (j == 0) sum = poll + 1;
                else if (j == 1) sum = poll - 1;
                else sum = 2 * poll;

                if (sum == k) return ch[poll] + 1;
                else if (sum < 100001 && sum >= 0 && ch[sum] == 0) {
                    ch[sum] = ch[poll] + 1;
                    queue.offer(sum);
                }
            }
        }
        return 0;
    }
}
