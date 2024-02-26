package main.level0;

public class 수열과_구간_쿼리_1 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            for (int k = i; k <= j; k++) {
                arr[k]++;
            }
        }
        return arr;
    }
}
