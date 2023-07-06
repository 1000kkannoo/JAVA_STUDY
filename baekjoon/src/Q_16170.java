import java.time.LocalDate;
import java.time.ZoneId;
import java.util.StringTokenizer;

public class Q_16170 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String date = String.valueOf(LocalDate.now(ZoneId.of("UTC+0")));
        StringTokenizer st = new StringTokenizer(date, "-");

        sb.append(st.nextToken()).append("\n");
        sb.append(st.nextToken()).append("\n");
        sb.append(st.nextToken()).append("\n");

        System.out.println(sb);
    }
}
