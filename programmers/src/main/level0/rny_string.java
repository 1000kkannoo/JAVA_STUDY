package main.level0;

public class rny_string {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
    }

    private static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
