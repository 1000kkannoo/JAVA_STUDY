package main.level0;

public class 최댓값_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
    }

    private static int solution(int[] numbers) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                if (sum <= numbers[i] * numbers[j + 1]) {
                    sum = numbers[i] * numbers[j + 1];
                }
            }
        }
        return sum;
    }
}
