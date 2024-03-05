package main.level0;

import java.util.ArrayDeque;
import java.util.Deque;

public class 배열_만들기_4 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 4, 2, 5, 3});
        for (int n : solution) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;

        while (i < arr.length) {
            if (deque.isEmpty() || arr[i] > deque.getLast()) {
                deque.offer(arr[i]);
                i++;
            } else {
                deque.pollLast();
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
