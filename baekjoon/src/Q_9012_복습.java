import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_9012_복습 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            char[] charArray = br.readLine().toCharArray();
            boolean isNotCorrect = false;
            for (char c : charArray) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isNotCorrect = true;
                        break;
                    }
                    stack.pop();
                }
            }
            if (isNotCorrect || !stack.isEmpty()) {
                sb.append("NO").append("\n");
            } else {
                sb.append("YES").append("\n");
            }
            stack.clear();
        }

        System.out.println(sb);
    }
}
