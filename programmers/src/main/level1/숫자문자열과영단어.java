package main.level1;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
    }

    public static int solution(String s) {
        String[] word = {
                "zero", "one", "two", "three",
                "four", "five", "six", "seven",
                "eight", "nine"
        };
        for (int i = 0; i < word.length; i++) {
            s = s.replaceAll(word[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
