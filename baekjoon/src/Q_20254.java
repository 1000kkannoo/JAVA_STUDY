import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_20254 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int UR = Integer.parseInt(split[0]);
        int TR = Integer.parseInt(split[1]);
        int UO = Integer.parseInt(split[2]);
        int TO = Integer.parseInt(split[3]);
        System.out.println(solution(UR, TR, UO, TO));
    }

    private static int solution(int ur, int tr, int uo, int to) {
        return (56 * ur) + (24 * tr) + (14 * uo) + (6 * to);
    }
}
