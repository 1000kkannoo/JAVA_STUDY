package main.level0;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        int[] solution = solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        System.out.printf("[%d,%d]", solution[0], solution[1]);
    }

    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            StringTokenizer st = new StringTokenizer(op, " ");
            String command = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (command.equals("I")) {
                minPq.add(num);
                maxPq.add(num);
            } else if (command.equals("D")) {
                if (!minPq.isEmpty()) {
                    if (num == 1) {
                        int max = maxPq.poll();
                        minPq.remove(max);
                    } else if (num == -1) {
                        int min = minPq.poll();
                        maxPq.remove(min);
                    }
                }
            }
        }

        return getMaxAndMinArr(minPq, maxPq);
    }

    private static int[] getMaxAndMinArr(PriorityQueue<Integer> minPq, PriorityQueue<Integer> maxPq) {
        if (minPq.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxPq.peek(), minPq.peek()};
        }
    }
}

