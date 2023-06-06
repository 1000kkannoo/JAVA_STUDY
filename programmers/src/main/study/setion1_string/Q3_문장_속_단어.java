package main.study.setion1_string;

import java.util.Scanner;

public class Q3_문장_속_단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(solution(word));
    }

    private static String solution(String word) {
        String answer = "";
        String[] wordSplit = word.split(" ");
        for (String str : wordSplit) {
            if (answer.length() < str.length()) {
                answer = str;
            }
        }
        return answer;
    }
}
