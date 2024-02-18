package main.level0;

import java.util.Arrays;

public class 문자열_정렬하기_2 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = Character.toLowerCase(charArray[i]);
        }

        Arrays.sort(charArray);
        for (char c : charArray) {
            answer.append(c);
        }

        return answer.toString();
    }
}
