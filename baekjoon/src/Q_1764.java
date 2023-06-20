import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1764 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        Arrays.sort(arr);

        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int index = Arrays.binarySearch(arr, br.readLine());
            if (index >= 0) answer.add(arr[index]);
        }

        Collections.sort(answer);
        for (String name : answer) sb.append(name).append("\n");
        System.out.println(answer.size() + "\n" + sb);
    }
}
