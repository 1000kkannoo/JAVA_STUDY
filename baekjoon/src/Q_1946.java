import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Score {
    private final int docsScore;
    private final int communityScore;

    public Score(int docsScore, int communityScore) {
        this.docsScore = docsScore;
        this.communityScore = communityScore;
    }

    public int getDocsScore() {
        return docsScore;
    }

    public int getCommunityScore() {
        return communityScore;
    }
}

public class Q_1946 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Score[] scores = new Score[n];
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" ");
                scores[i] = new Score(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
            Arrays.sort(scores, (s1, s2) -> s1.getDocsScore() - s2.getDocsScore());

            int count = 1;
            int minScore = scores[0].getCommunityScore();
            for (int i = 1; i < n; i++) {
                if (scores[i].getCommunityScore() < minScore) {
                    minScore = scores[i].getCommunityScore();
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
