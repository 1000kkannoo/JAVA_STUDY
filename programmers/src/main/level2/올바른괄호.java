package main.level2;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    static boolean solution(String s) {
        String[] sArr = s.split("");
        int stack = 0;
        boolean togle = true;

        for (int i = 0; i < sArr.length; i++) {
            if (togle && sArr[i].equals(")")) {
                return false;
            }

            if (!togle && sArr[i].equals("(")) {
                return false;
            }

            if (sArr[i].equals("(")) {
                togle = true;
                stack += 1;
                if (sArr[i + 1].equals(")")) {
                    togle = false;
                }
                continue;
            }

            if (sArr[i].equals(")")) {
                togle = false;
                stack--;
                if (stack == 0) {
                    togle = true;
                }
            }
        }
        return true;
    }
}
