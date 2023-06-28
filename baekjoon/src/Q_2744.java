import java.util.Scanner;

public class Q_2744 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(Character.toLowerCase(ch));
        }
        System.out.println(sb);
    }
}
