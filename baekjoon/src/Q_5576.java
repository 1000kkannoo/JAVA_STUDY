import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_5576 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> W = getIntegers(br);
        List<Integer> K = getIntegers(br);

        System.out.println(getAvgTop3(W) + " " + getAvgTop3(K));
    }

    private static List<Integer> getIntegers(BufferedReader br) throws IOException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(Integer::compareTo);
        return list;
    }

    private static Integer getAvgTop3(List<Integer> list) {
        int score1 = list.get(list.size() - 1);
        int score2 = list.get(list.size() - 2);
        int score3 = list.get(list.size() - 3);

        return (score1 + score2 + score3);
    }
}
