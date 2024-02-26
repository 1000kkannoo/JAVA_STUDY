package main.level0;

public class 이차원으로_만들기 {
    public static void main(String[] args) {
        int[][] solution = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[] num_list, int n) {
        int i = num_list.length / n;
        int[][] answer = new int[i][n];

        int index = 0;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < n; k++) {
                answer[j][k] = num_list[index++];
            }
        }

        return answer;
    }
}
