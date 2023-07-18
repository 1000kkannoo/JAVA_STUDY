package main.level0;

public class I로_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("jjnnllkkmm"));
    }

    public static String solution(String myString) {
        return myString.replaceAll("[a-k]","l");
    }
}
