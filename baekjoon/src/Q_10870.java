import java.util.Scanner;

public class Q_10870 {
    static int[] fibonachi;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 0) System.out.println(0);
        else {
            fibonachi = new int[n + 1];
            fibonachi[0] = 0;
            fibonachi[1] = 1;
            DFS(2);
            System.out.println(fibonachi[fibonachi.length - 1]);
        }
    }

    private static void DFS(int index) {
        if (index == n + 1) return;
        fibonachi[index] = fibonachi[index - 1] + fibonachi[index - 2];
        DFS(index + 1);
    }
}
