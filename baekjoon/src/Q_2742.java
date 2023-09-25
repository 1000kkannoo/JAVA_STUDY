import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int num : solution(Integer.parseInt(br.readLine()))) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }

    private static List<Integer> solution(Integer s) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = s; i > 0; i--) {
            numbers.add(i);
        }
        return numbers;
    }
}
