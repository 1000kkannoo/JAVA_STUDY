import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_1021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.offer(i);

        int[] targets = new int[M];
        for (int i = 0; i < M; i++) targets[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution(queue, targets));
    }

    private static int solution(LinkedList<Integer> queue, int[] targets) {
        int sum = 0;

        for (int target : targets) {
            int targetIndex = queue.indexOf(target);

            if (targetIndex <= queue.size() / 2) {
                for (int i = 0; i < targetIndex; i++) {
                    queue.offerLast(queue.pollFirst());
                    sum++;
                }
            } else {
                for (int i = 0; i < queue.size() - targetIndex; i++) {
                    queue.offerFirst(queue.pollLast());
                    sum++;
                }
            }

            queue.pollFirst();
        }

        return sum;
    }
}
