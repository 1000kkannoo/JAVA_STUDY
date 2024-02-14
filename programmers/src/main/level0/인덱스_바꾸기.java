package main.level0;

public class 인덱스_바꾸기 {
    public static void main(String[] args) {
        String solution = solution("hello", 1, 2);
        System.out.println(solution);
    }

    public static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;
        for (char c : charArray) {
            sb.append(c);
        }
        return sb.toString();
    }
}
