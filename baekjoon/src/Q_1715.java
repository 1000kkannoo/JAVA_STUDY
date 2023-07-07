import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Q_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;

        while (pq.size() > 1) { // queue안에 최소 2개 이상 남아있을때 반복
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            answer += sum;
            pq.add(sum);
        }

        System.out.println(answer);
    }
}
