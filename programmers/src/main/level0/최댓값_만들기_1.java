package main.level0;

public class 최댓값_만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    private static int solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                if (numbers[i] < numbers[j + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers[0] * numbers[1];
    }
}
