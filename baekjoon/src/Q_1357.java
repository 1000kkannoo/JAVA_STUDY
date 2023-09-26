import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1357 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine().split(" ")));
    }

    private static Integer solution(String[] str) {
        String X = str[0];
        String Y = str[1];

        return rev(String.valueOf(rev(X) + rev(Y)));
    }

    private static Integer rev(String num) {
        return Integer.parseInt(new StringBuilder(num).reverse().toString());
    }
}
