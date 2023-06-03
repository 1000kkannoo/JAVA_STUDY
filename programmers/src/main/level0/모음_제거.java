package main.level0;

public class 모음_제거 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
    }

    private static String solution(String my_string) {
        String aeiou = "aeiou";
        for (int i = 0; i < 5; i++) {
            my_string = my_string.replaceAll(String.valueOf(aeiou.charAt(i)), "");
        }
        return my_string;
    }
}
