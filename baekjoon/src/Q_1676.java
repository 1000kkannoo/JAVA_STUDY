import java.util.Scanner;

public class Q_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        count += n / 5;
        count += n / 25;
        count += n / 125;

        System.out.println(count);
    }
}
