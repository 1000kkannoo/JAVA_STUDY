package main.study.setion5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6_공주_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }

    private static int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 1;
        while (queue.size() != 1) {
            int poll = queue.poll();
            if (cnt != m) queue.offer(poll);
            else cnt = 0;
            cnt++;
        }

        answer = queue.poll();
        return answer;
    }
}
