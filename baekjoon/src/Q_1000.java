import java.util.Scanner;

public class Q_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        return a + b;
    }
}
