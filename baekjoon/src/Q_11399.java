import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class People implements Comparable<People> {
    int number;
    int minute;

    public People(int number, int minute) {
        this.number = number;
        this.minute = minute;
    }

    @Override
    public int compareTo(People ob) {
        return this.minute - ob.minute;
    }
}

public class Q_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<People> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            list.add(new People(i, Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);

        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i).minute;
            result += sum;
        }
        System.out.println(result);
    }
}
