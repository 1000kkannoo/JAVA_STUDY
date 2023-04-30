package level1;

public class 가운데글자가져오기 {

    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        return s.length() % 2 == 0 ? String.valueOf(s.charAt(s.length() / 2 - 1)) + s.charAt(s.length() / 2) : String.valueOf(s.charAt(s.length() / 2));
    }
}
