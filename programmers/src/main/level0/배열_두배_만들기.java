package main.level0;

public class 배열_두배_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }

    private static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
