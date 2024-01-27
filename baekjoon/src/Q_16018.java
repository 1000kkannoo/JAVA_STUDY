import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_16018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        System.out.println(solution(chars1,chars2));
    }

    private static int solution(char[] chars1, char[] chars2) {
        int answer = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == 'C' && chars2[i] == 'C') {
                answer++;
            }
        }
        return answer;
    }
}
