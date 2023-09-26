import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        List<Integer> helmets = getBestDefendSortList(br);
        List<Integer> vests = getBestDefendSortList(br);

        System.out.println(helmets.get(N - 1) + vests.get(M - 1));
    }

    private static List<Integer> getBestDefendSortList(BufferedReader br) throws IOException {
        List<Integer> defendList = new ArrayList<>();
        String[] defends = br.readLine().split(" ");
        for (String vest : defends) {
            defendList.add(Integer.parseInt(vest));
        }
        defendList.sort(Integer::compareTo);

        return defendList;
    }
}
