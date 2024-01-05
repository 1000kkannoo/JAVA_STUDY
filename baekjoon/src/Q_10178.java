import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_10178 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] split = br.readLine().split(" ");
            int candy = Integer.parseInt(split[0]);
            int people = Integer.parseInt(split[1]);
            int getPiece = candy / people;
            int getDadPiece = candy % people;

            String format = String.format("You get %d piece(s) and your dad gets %d piece(s).", getPiece, getDadPiece);
            sb.append(format).append("\n");
        }

        System.out.println(sb);
    }
}
