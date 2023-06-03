package main.level1;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        System.out.println(solution
                (16, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        String var = "%0" + n + "d";

        for (int i = 0; i < n; i++) {
            strArr1[i] = String.format(var,Long.parseLong(Integer.toBinaryString(arr1[i])));
            strArr2[i] = String.format(var,Long.parseLong(Integer.toBinaryString(arr2[i])));
        }

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            char[] charsArr1 = strArr1[i].toCharArray();
            char[] charsArr2 = strArr2[i].toCharArray();
            char[] charsAnswer = new char[n];
            for (int j = 0; j < n; j++) {
                if (charsArr1[j] == '1' || charsArr2[j] == '1') {
                    charsAnswer[j] = '#';
                } else {
                    charsAnswer[j] = ' ';
                }
            }
            answer[i] = String.valueOf(charsAnswer);
        }

        return answer;

/*      비트연산이용

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;*/
    }
}
