package ch5_Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class People {
    private final int num;
    private final int danger;

    public People(int num, int danger) {
        this.num = num;
        this.danger = danger;
    }

    public int getNum() {
        return num;
    }

    public int getDanger() {
        return danger;
    }
}

public class 응급실 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int count = 0;
        Queue<People> queue = new LinkedList<>();
        PriorityQueue<Integer> set = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            int danger = arr[i];
            set.add(danger);
            queue.offer(new People(i, danger));
        }

        while (true) {
            People poll = queue.poll();
            Integer max = set.peek();
            if (poll.getDanger() == max) {
                set.poll();
                if (poll.getNum() == m) {
                    return count + 1;
                } else {
                    count++;
                    queue.offer(poll);
                }
            } else {
                queue.offer(poll);
            }
        }
    }
}
