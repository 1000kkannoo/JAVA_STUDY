import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] tCase = new int[n][6];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 6; j++) {
                tCase[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, tCase));
    }

    private static String solution(int n, int[][] tCase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x1 = tCase[i][0];
            int y1 = tCase[i][1];
            int r1 = tCase[i][2];
            int x2 = tCase[i][3];
            int y2 = tCase[i][4];
            int r2 = tCase[i][5];

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            int length = r1 + r2;
            int sub = Math.abs(r1 - r2);
            if (r1 == 0 && r2 == 0) {
                sb.append(0).append("\n");
            } else if (distance == 0 && r1 == r2) {
                sb.append(-1).append("\n");
            } else if (distance < sub) {
                sb.append(0).append("\n");
            } else if (distance > length) {
                sb.append(0).append("\n");
            } else if (distance == sub) {
                sb.append(1).append("\n");
            } else if (distance == length) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }
        }
        return sb.toString();
    }
}
