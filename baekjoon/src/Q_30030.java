import java.util.Scanner;

public class Q_30030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(Integer.parseInt(sc.nextLine())));
    }

    private static int solution(int price) {
        int answer = 0;
        for (int i = 100; i <= 9900; i += 100) {
            if (i + (i / 10) == price) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
