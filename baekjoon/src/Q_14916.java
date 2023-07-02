import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_14916 {
    static int[] ch, money;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ch = new int[100001];
        money = new int[]{5, 2};

        System.out.println(BFS(n));
    }

    private static int BFS(int n) {
        if (n == 2 || n == 5) return 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int value : money) {
                int nextVal = poll - value;
                if (nextVal < 0) continue;
                else if (nextVal == 0) return ch[poll] + 1;
                else {
                    if (ch[nextVal] == 0) {
                        ch[nextVal] = ch[poll] + 1;
                        queue.offer(nextVal);
                    }
                }
            }
        }
        return -1;
    }
}
