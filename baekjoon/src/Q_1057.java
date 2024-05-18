import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1057 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        System.out.println(solution(n, kim, lim));
    }

    private static int solution(int n, int kim, int lim) {
        int round = 0;
        while (kim != lim) {
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            round++;
        }
        return round;
    }

}
