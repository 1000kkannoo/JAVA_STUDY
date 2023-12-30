import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_30033 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int size = Integer.parseInt(br.readLine());
        List<Integer> todoList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> realTodoList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < size; i++) {
            int todo = todoList.get(i);            int realTodo = realTodoList.get(i);
            if (realTodo >= todo) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
