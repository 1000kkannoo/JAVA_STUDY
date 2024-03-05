package main.level0;

public class 문자열_여러번_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int[] query : queries) {
            int index1 = query[0];
            int index2 = query[1];
            for (int i = index1, j = index2; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
        }

        for (char c : charArray) {
            answer.append(c);
        }

        return answer.toString();
    }
}
