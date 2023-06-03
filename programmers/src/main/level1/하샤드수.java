package main.level1;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static boolean solution(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';
        }
        return num % sum == 0;
    }
}
