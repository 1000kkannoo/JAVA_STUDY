package main.level0;

public class 공백으로_구분하기 {
    public static void main(String[] args) {
        System.out.println(solution("i love you"));
    }

    private static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
