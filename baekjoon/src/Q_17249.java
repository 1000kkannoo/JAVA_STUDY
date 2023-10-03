import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_17249 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("0");

        long left = getFilterCount(str[0]);
        long right = getFilterCount(str[1]);

        System.out.println(left + " " + right);
    }

    private static long getFilterCount(String str) {
        return str.chars().filter(ch -> ch == '@').count();
    }
}
