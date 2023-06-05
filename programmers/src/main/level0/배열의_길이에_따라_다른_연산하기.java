package main.level0;

public class 배열의_길이에_따라_다른_연산하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 12, 100, 276, 33}, 27));
    }

    private static int[] solution(int[] arr, int n) {
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i % 2 == 0) ? arr[i] + n : arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i % 2 != 0) ? arr[i] + n : arr[i];
            }
        }

        return arr;
    }
}
