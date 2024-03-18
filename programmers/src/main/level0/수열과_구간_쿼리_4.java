package main.level0;

public class 수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}});
        for (int n : solution) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            caculateArr(arr, s, e, k);
        }

        return arr;
    }

    private static void caculateArr(int[] arr, int s, int e, int k) {
        for (int j = 0; j < arr.length; j++) {
            if (s <= j && j <= e) {
                if (j % k == 0) {
                    arr[j] += 1;
                }
            }
        }
    }
}