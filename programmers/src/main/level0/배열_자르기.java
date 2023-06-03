package main.level0;

public class 배열_자르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 1, 3));
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0, j = 0; i < numbers.length; ) {
            if (i >= num1 && i <= num2) {
                answer[j] = numbers[i];
                j++;
            }
            i++;
        }
        return answer;
    }
}
