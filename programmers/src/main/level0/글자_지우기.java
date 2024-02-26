package main.level0;

public class 글자_지우기 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }

    public static String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int index : indices) {
            charArray[index] = ' ';
        }

        for (char c : charArray) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
