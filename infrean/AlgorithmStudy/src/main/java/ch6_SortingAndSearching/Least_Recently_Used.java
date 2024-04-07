package ch6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Least_Recently_Used {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, m, arr));
    }

    private static String solution(int n, int m, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        for (int num : arr) {
            if (deque.size() < n) {
                if (deque.contains(num)) {
                    deque.remove(num);
                    deque.offer(num);
                } else {
                    deque.offer(num);
                }
            }
            else if (deque.size() == n){
                if (deque.contains(num)) {
                    deque.remove(num);
                    deque.offer(num);
                } else {
                    deque.pollFirst();
                    deque.offer(num);
                }
            }
        }

        while (!deque.isEmpty()) {
            sb.append(deque.pollLast()).append(" ");
        }
        return sb.toString();
    }
}
