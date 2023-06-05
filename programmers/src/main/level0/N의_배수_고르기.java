package main.level0;

public class N의_배수_고르기 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }

    private static int[] solution(int n, int[] numlist) {
        int length = 0;
        for (int num : numlist) {
            length = (num % n == 0) ? length + 1 : length;
        }

        int[] answer = new int[length];
        for (int i = 0, j = 0; i < answer.length; j++) {
            if (numlist[j] % n == 0) {
                answer[i] = numlist[j];
                i++;
            }
        }

        return answer;
    }
}
