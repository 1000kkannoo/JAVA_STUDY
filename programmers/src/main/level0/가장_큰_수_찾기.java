package main.level0;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        int[] answer = solution(array);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
