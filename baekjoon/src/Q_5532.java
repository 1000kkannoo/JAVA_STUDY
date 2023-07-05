import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5532 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int dayA = (A % C != 0) ? (A / C) + 1 : A / C;
        int dayB = (B % D != 0) ? (B / D) + 1 : B / D;

        System.out.println(L - Math.max(dayA, dayB));
    }
}
