import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GamePerson {
    private Integer score;

    private GamePerson() {
        this.score = 100;
    }

    public Integer getScore() {
        return score;
    }

    public static GamePerson createGamePerson() {
        return new GamePerson();
    }

    public void scoreMinus(Integer minus) {
        this.score -= minus;
    }
}

public class Q_10103 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n, br));
    }

    private static String solution(int n, BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        GamePerson changYoung = GamePerson.createGamePerson();
        GamePerson sangDeock = GamePerson.createGamePerson();

        while (n --> 0) {
            String[] split = br.readLine().split(" ");
            playGame(changYoung, sangDeock, split);
        }

        sb.append(changYoung.getScore()).append("\n").append(sangDeock.getScore());
        return sb.toString();
    }

    private static void playGame(GamePerson changYoung, GamePerson sangDeock, String[] split) {
        int changScore = Integer.parseInt(split[0]);
        int sangScore = Integer.parseInt(split[1]);

        if (changScore > sangScore) {
            sangDeock.scoreMinus(changScore);
        } else if (changScore < sangScore) {
            changYoung.scoreMinus(sangScore);
        }
    }
}
