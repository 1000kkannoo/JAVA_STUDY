package main.level0;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String[] my_strings = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String myString = my_strings[i];
            String substring = myString.substring(parts[i][0], parts[i][1] + 1);
            sb.append(substring);
        }

        return sb.toString();
    }
}
