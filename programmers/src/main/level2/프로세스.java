package main.level2;

import java.util.LinkedList;
import java.util.Queue;

class Process {
    int num;
    int importance;

    public Process(int num, int importance) {
        this.num = num;
        this.importance = importance;
    }
}

public class 프로세스 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();

        int max = 0;
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
            max = Math.max(max, priorities[i]);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            Process poll = queue.poll();

            if (poll.importance == max) {
                count++;
                if (poll.num == location) return count;
                else {
                    max = Integer.MIN_VALUE;
                    for (Process process : queue) {
                        max = Math.max(process.importance, max);
                    }
                }
            } else {
                queue.offer(poll);
            }
        }

        return 0;
    }
}
