package main.level0;

public class 수_조작하기_1 {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    private static int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            switch (ch) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
