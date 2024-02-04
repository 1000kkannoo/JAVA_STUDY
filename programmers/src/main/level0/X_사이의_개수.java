package main.level0;

public class X_사이의_개수 {
    public static void main(String[] args) {
        String input = "xabcxdefxghi";
        int[] answer = solution(input);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(String input) {
        String[] split = input.split("x");
        int[] answer = new int[split.length];
        if (input.charAt(input.length() - 1) == 'x') {
            answer = new int[split.length + 1];
            answer[split.length] = 0;
        }

        for (int i = 0; i < split.length; i++) {
            answer[i] = split[i].length();
        }

        return answer;
    }
}
