import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2490 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                String a = st.nextToken();
                if (a.equals("1")) count++;
            }

            switch (count) {
                case 0:
                    sb.append("D").append("\n");
                    break;
                case 1:
                    sb.append("C").append("\n");
                    break;
                case 2:
                    sb.append("B").append("\n");
                    break;
                case 3:
                    sb.append("A").append("\n");
                    break;
                case 4:
                    sb.append("E").append("\n");
            }
        }

        System.out.println(sb);
    }
}
