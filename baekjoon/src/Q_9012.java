import java.util.Scanner;
import java.util.Stack;

public class Q_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String s : solution(n, arr)) {
            System.out.println(s);
        }
    }

    private static String[] solution(int n, String[] arr) {
        String[] answer = new String[n];
        for (int i = 0; i < answer.length; i++) {
            String vps = arr[i];
            Stack<Character> stack = new Stack<>();
            for (char ch : vps.toCharArray()) {
                if (stack.isEmpty() && ch == ')') {
                    answer[i] = "NO";
                    break;
                }
                else if (ch == '(') stack.push(ch);
                else stack.pop();
            }
            answer[i] = (answer[i] == null && stack.isEmpty()) ? "YES" : "NO";
        }
        return answer;
    }
}
