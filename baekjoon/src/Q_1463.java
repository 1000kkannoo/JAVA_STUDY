import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_1463 {
    static int[] numbers = {1, 2, 3};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(BFS(n));
    }

    private static int BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int level = 0;
        int[] dp = new int[n + 1];
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int poll = queue.poll();
                for (int number : numbers) {
                    int next = 0;
                    if (number == 1) next = poll - 1;
                    else if (poll % number == 0) next = poll / number;

                    if (next == 1) return level + 1;

                    if (next != 0 && dp[next] == 0) {
                        dp[next] = 1;
                        queue.offer(next);
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
