package ch7_DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class 송아지_찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        System.out.println(BFS(n, m));
    }

    private static int BFS(int n, int m) {
        int[] number = new int[]{1, 5, -1};
        Map<Integer, Integer> map = new HashMap<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                if (poll == m) {
                    return depth;
                } else {
                    for (int k : number) {
                        if (!map.containsKey(poll + k)) {
                            map.put(poll + k, 1);
                            queue.offer(poll + k);
                        }
                    }
                }
            }
            depth++;
        }

        return -1;
    }
}
