package main.level0;

public class 조건에_맞게_수열_변환하기_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}, 3));
    }

    private static int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        }
        return arr;
    }
}
