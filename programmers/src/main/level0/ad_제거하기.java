package main.level0;

import java.util.Scanner;

public class ad_제거하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String st : solution(arr)) {
            System.out.print(st + " ");
        }
    }

    private static String[] solution(String[] strArr) {
        int[] ch = new int[strArr.length];
        int length = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) ch[i] = 1;
            else length++;
        }

        String[] answer = new String[length];
        for (int i = 0, j = 0; i < strArr.length; i++) {
            if (ch[i] == 0) answer[j++] = strArr[i];
        }

        return answer;
    }
}
