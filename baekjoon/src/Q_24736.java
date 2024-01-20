import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_24736 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] home = br.readLine().split(" ");
        String[] away = br.readLine().split(" ");

        System.out.println(solution(home, away));
    }

    private static String solution(String[] home, String[] away) {
        int homeScore = getScore(home);
        int awayScore = getScore(away);
        return homeScore + " " + awayScore;
    }

    private static int getScore(String[] home) {
        int T = Integer.parseInt(home[0]);
        int F = Integer.parseInt(home[1]);
        int S = Integer.parseInt(home[2]);
        int P = Integer.parseInt(home[3]);
        int C = Integer.parseInt(home[4]);
        return (6 * T) + (3 * F) + (2 * S) + (P + 2 * C);
    }
}
