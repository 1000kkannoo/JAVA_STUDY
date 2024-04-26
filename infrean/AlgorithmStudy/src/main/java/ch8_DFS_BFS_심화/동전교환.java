package ch8_DFS_BFS_심화;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 동전교환 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        m = Integer.parseInt(br.readLine());

        System.out.println(BFS(0));
    }

    private static int BFS(int level) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            queue.offer(num);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                if (poll == m) {
                    return level + 1;
                }
                for (int num : arr) {
                    queue.offer(poll + num);
                }
            }
            level++;
        }

        return -1;
    }
}
