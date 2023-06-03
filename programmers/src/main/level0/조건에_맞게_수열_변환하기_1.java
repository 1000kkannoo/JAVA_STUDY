package main.level0;

public class 조건에_맞게_수열_변환하기_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    private static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}
