import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Food {
    int taste1;
    int taste2;

    public Food(int taste1, int taste2) {
        this.taste1 = taste1;
        this.taste2 = taste2;
    }
}

public class Q_2961 {
    static ArrayList<Food> arr;
    static int min = Integer.MAX_VALUE, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int taste1 = Integer.parseInt(st.nextToken());
            int taste2 = Integer.parseInt(st.nextToken());
            arr.add(new Food(taste1, taste2));
        }

        DFS(0, 1, 0);

        System.out.println(min);
    }

    private static void DFS(int index, int sum1, int sum2) {
        for (int i = index; i < n; i++) {
            Food food = arr.get(i);
            int prevSum1 = sum1;
            int prevSum2 = sum2;
            sum1 *= food.taste1;
            sum2 += food.taste2;
            min = Math.min(min, Math.abs(sum1 - sum2));
            DFS(i + 1, sum1, sum2);
            sum1 = prevSum1;
            sum2 = prevSum2;
        }
    }
}
