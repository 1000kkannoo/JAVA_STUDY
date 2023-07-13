package main.level2;

public class 피로도 {
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

    static int[][] dungeon;
    static int[] ch;
    static int answer;

    public static int solution(int k, int[][] dungeons) {
        answer = -1;
        dungeon = dungeons;
        ch = new int[dungeons.length];
        DFS(k, 0);
        return answer;
    }

    private static void DFS(int k, int count) {
        answer = Math.max(answer, count);
        for (int i = 0; i < dungeon.length; i++) {
            int minimum = dungeon[i][0];
            int expend = dungeon[i][1];

            if (k >= minimum && ch[i] == 0) {
                ch[i] = 1;
                DFS(k - expend, count + 1);
                ch[i] = 0;
            }
        }
    }
}
