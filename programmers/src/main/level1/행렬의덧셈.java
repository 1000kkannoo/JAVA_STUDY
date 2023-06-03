package main.level1;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 3}};
        int[][] b = {{4, 6}, {7, 9}};
        System.out.println(solution(a, b));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr1;
    }
}
