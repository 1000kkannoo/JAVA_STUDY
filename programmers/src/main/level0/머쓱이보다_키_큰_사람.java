package main.level0;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{180, 120, 191}, 190));
    }

    private static int solution(int[] array, int height) {
        int answer = 0;
        for (int friend : array) {
            if (friend > height) {
                answer++;
            }
        }
        return answer;
    }
}
