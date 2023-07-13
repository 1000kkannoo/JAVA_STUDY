package main.level2;

import java.util.PriorityQueue;

public class 더_맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : scoville) pq.offer(num);

        int count = 0;
        while (!pq.isEmpty()) {
            int check = pq.poll();
            if (check < K) {
                if (pq.isEmpty()) return -1;
                int poll = pq.poll();
                pq.offer(check + (poll * 2));
                count++;
            }
        }

        return count;
    }
}
