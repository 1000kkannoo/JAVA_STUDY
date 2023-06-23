import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_4949 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            Stack<Character> stack = new Stack<>();

            boolean isBalance = true;
            for (char ch : str.toCharArray()) {
                if (ch == '(') stack.push(ch);
                else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalance = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
                if (ch == '[') stack.push(ch);
                else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalance = false;
                        break;
                    } else stack.pop();
                }
            }

            if (!stack.isEmpty()) isBalance = false;
            if (isBalance) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.println(sb);
    }
}
