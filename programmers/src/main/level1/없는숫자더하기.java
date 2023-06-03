package main.level1;

public class 없는숫자더하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int j;
        for (int i = 0; i <= 9; i++) {
            for (j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    break;
                }
            }
            answer += (j == numbers.length ? i : 0);
        }
        return answer;
    }
}
