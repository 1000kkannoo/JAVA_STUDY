package ch5_Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 공주_구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        System.out.println(solution(n, m));
    }

    private static int solution(int n, int m) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 0;

        while (queue.size() > 1) {
            count++;
            if (count == m) {
                count = 0;
                queue.poll();
            } else {
                queue.offer(queue.poll());
            }
        }

        return queue.poll();
    }
}
