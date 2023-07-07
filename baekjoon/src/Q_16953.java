import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Count {
    long num;
    int cnt;

    public Count(long num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }
}

public class Q_16953 {
    static long A, B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(BFS(A));
    }

    private static long BFS(long A) {
        Queue<Count> queue = new LinkedList<>();
        queue.offer(new Count(A, 1));


        while (!queue.isEmpty()) {
            Count poll = queue.poll();
            long n = poll.num * 2;
            long m = (poll.num * 10) + 1;
            if (n <= B) {
                if (n == B) {
                    return poll.cnt + 1;
                } else {
                    queue.offer(new Count(n, poll.cnt + 1));
                }
            }
            if (m <= B) {
                if (m == B) {
                    return poll.cnt + 1;
                } else {
                    queue.offer(new Count(m, poll.cnt + 1));
                }
            }
        }

        return -1;
    }
}
