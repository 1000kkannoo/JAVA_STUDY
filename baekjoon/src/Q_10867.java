import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q_10867 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr));
    }

    private static String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new TreeSet<>();
        for (int n : arr) set.add(n);
        for (int n : set) sb.append(n).append(" ");

        return sb.toString();
    }
}
