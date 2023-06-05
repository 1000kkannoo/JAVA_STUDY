package main.level0;

public class 대문자와_소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
    }

    private static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            sb = (ch <= 'Z') ?
                    sb.append(Character.toLowerCase(ch)) :
                    sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }
}
