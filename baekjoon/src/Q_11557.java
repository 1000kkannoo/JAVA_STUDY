import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class Q_11557 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = parseInt(br.readLine());

        while (T --> 0) {
            String maxCollage = " ";
            int maxNum = MIN_VALUE;
            int num = parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                String[] split = br.readLine().split(" ");
                String name = split[0];
                int price = parseInt(split[1]);
                if (price > maxNum) {
                    maxCollage = name;
                    maxNum = price;
                }
            }

            sb.append(maxCollage).append("\n");
        }
        System.out.println(sb);
    }
}
