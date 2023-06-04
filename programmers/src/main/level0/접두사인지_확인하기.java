package main.level0;

public class 접두사인지_확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana","ban"));
    }

    private static int solution(String my_string, String is_prefix) {
        String jeobdoosa = "";
        for (int i = 0; i < my_string.length(); i++) {
            jeobdoosa += my_string.charAt(i);
            if (jeobdoosa.equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}
