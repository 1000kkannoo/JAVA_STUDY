package main.level0;

public class 칠의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String s = String.valueOf(i);
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (c == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
