import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30889 {
    public static int[][] CINEMA = new int[10][20];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String sit = br.readLine();
            int h = sit.charAt(0) - 65;
            int w = Integer.parseInt(sit.substring(1)) - 1;
            CINEMA[h][w] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int[] ints : CINEMA) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    sb.append(".");
                } else {
                    sb.append("o");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
