import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_15720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int B = Integer.parseInt(split[0]);
        int C = Integer.parseInt(split[1]);
        int D = Integer.parseInt(split[2]);
        int max = Math.max(Math.max(B, C), D);

        int[] bugger = new int[max];
        int[] side = new int[max];
        int[] drink = new int[max];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) bugger[i] = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) side[i] = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < D; i++) drink[i] = Integer.parseInt(st3.nextToken());

        System.out.println(solution(bugger, side, drink));
    }

    private static String solution(int[] bugger, int[] side, int[] drink) {
        Arrays.sort(bugger);
        Arrays.sort(side);
        Arrays.sort(drink);

        int result = 0;
        int resultDiscount = 0;
        for (int i = bugger.length - 1; i >= 0; i--) {
            int sum = bugger[i] + side[i] + drink[i];
            result += sum;
            if (bugger[i] != 0 && side[i] != 0 && drink[i] != 0) {
                sum = (int) (sum * 0.9);
            }
            resultDiscount += sum;
        }

        return result + "\n" + resultDiscount;
    }
}
