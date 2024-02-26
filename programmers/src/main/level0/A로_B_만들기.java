package main.level0;

public class A로_B_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh","hello"));
    }

    public static int solution(String before, String after) {
        char[] afterCharArray = after.toCharArray();
        char[] beforeCharArray = before.toCharArray();
        for (char c : beforeCharArray) {
            for (int j = 0; j < afterCharArray.length; j++) {
                if (afterCharArray[j] == c) {
                    afterCharArray[j] = ' ';
                    break;
                }
            }
        }

        for (char c : afterCharArray) {
            if (c != ' ') {
                return 0;
            }
        }

        return 1;
    }
}
