package main.level0;

public class 배열_회전시키기 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3}, "right");
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, answer.length - 1);
            return answer;
        }

        answer[numbers.length - 1] = numbers[0];
        System.arraycopy(numbers, 1, answer, 0, answer.length - 1);
        return answer;
    }
}
