package main.level0;

public class 접미사인지_확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "nan"));
    }

    private static int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
