import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q_1449 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        TreeSet<Double> treeSet = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            treeSet.add(num - 0.5);
            treeSet.add((double) num);
            treeSet.add(num + 0.5);
        }

        double max = treeSet.first() + m;
        int count = 1;
        for (Double num : treeSet) {
            if (max < num) {
                count++;
                max = num + m;
            }
        }

        System.out.println(count);
    }
}
