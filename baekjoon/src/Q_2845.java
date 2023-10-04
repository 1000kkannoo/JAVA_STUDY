import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2845 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int val = getVal(split[0], split[1]);

        String[] input = br.readLine().split(" ");
        appendAnswer(sb, val, input);

        System.out.println(sb);
    }

    private static void appendAnswer(StringBuilder sb, int val, String[] input) {
        for (String s : input) {
            sb.append(Integer.parseInt(s) - val).append(" ");
        }
    }

    private static int getVal(String input1, String input2) {
        int n = Integer.parseInt(input1);
        int m = Integer.parseInt(input2);
        return n * m;
    }
}
