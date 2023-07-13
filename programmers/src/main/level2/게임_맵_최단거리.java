package main.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}}));
    }

    static int[][] map;
    static int[] arrX = {-1, 0, 1, 0};
    static int[] arrY = {0, 1, 0, -1};

    public static int solution(int[][] maps) {
        map = maps;
        return BFS();
    }

    private static int BFS() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = current[0] + arrX[i];
                int nextY = current[1] + arrY[i];
                if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length && map[nextX][nextY] == 1) {
                    queue.offer(new int[]{nextX, nextY});
                    map[nextX][nextY] = map[current[0]][current[1]] + 1;
                }
            }
        }
        if (map[map.length - 1][map[0].length - 1] == 1) return -1;
        return map[map.length - 1][map[0].length - 1];
    }
}
