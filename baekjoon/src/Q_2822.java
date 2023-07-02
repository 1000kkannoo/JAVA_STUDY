import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 8; i++) {
            int val = Integer.parseInt(br.readLine());
            map.put(i, val);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += list.get(i).getValue();
        }

        System.out.println(sum);
    }
}
