package main.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        char[] stringArray = s.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length - i - 1; j++) {
                if (stringArray[j] < stringArray[j + 1]) {
                    char temp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = temp;
                }
            }
        }
        return new String(stringArray);
    }
}
