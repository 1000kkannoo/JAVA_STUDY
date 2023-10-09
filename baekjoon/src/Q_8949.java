import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;

public class Q_8949 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        saveStack(stack1, stack2);

        Stack<Integer> answer = new Stack<>();
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int num1 = (stack1.isEmpty()) ? 0 : stack1.pop();
            int num2 = (stack2.isEmpty()) ? 0 : stack2.pop();
            answer.push(num1 + num2);
        }

        while (!answer.isEmpty()) {
            sb.append(answer.pop());
        }

        System.out.println(sb);
    }

    private static void saveStack(Stack<Integer> stack1, Stack<Integer> stack2) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        String s1 = split[0];
        String s2 = split[1];
        for (String s : s1.split("")) {
            stack1.push(Integer.parseInt(s));
        }
        for (String s : s2.split("")) {
            stack2.push(Integer.parseInt(s));
        }
    }
}
