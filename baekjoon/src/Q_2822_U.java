import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Q_2822_U {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        int[] ch = new int[151];
        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(br.readLine());
            ch[num] = i + 1;
            arr[i] = num;
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 7; i > 2; i--) {
            int num = arr[i];
            sum += num;
            treeSet.add(ch[num]);
        }

        for (Integer integer : treeSet) {
            sb.append(integer).append(" ");
        }

        System.out.println(sum);
        System.out.println(sb);

    }
}
