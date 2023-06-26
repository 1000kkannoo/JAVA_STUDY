import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String num = sc.next();

        char[] chars = num.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) sb.append(chars[i]);

        System.out.println(sb);
    }
}
