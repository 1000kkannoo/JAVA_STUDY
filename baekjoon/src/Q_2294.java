import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2294 {
    static int[] ch, money;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ch = new int[1000001];
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        money = new int[n];
        for (int i = 0; i < n; i++) money[i] = Integer.parseInt(br.readLine());

        System.out.println(BFS(k));
    }

    private static int BFS(int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        ch[k] = 0;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int i = 0; i < money.length; i++) {
                int nextInt = poll - money[i];
                if (nextInt < 0) continue;
                else if (nextInt == 0) return ch[poll] + 1;
                else {
                    if (ch[nextInt] == 0) {
                        ch[nextInt] = ch[poll] + 1;
                        queue.offer(nextInt);
                    }
                }
            }
        }
        return -1;
    }
}
