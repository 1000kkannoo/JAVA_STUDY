import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = Integer.MAX_VALUE;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int lt = 0, rt = 0, sum = 0 ;
        while(true) {
            if(sum >= m){
                answer = Math.min(answer, rt - lt);
                sum -= arr[lt++];
            }
            else if(rt == n) break;
            else sum += arr[rt++];
        }

        if (answer == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(answer);
    }
}
