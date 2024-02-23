package main.level0;

public class 구로_나눈_나머지 {
    public static void main(String[] args) {
        System.out.println(solution("78720646226947352489"));
    }

    public static int solution(String number) {
        char[] charArray = number.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += Character.digit(c, 10);
        }

        return sum % 9;
    }
}
