package ch6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 좌표정렬 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Location> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            list.add(new Location(x, y));
        }

        System.out.println(solution(n, list));
    }

    private static String solution(int n, List<Location> list) {
        StringBuilder sb = new StringBuilder();
        list.sort((o1, o2) -> {
            if (o1.x == o2.x) {
                return Integer.compare(o1.y, o2.y);
            } else {
                return Integer.compare(o1.x, o2.x);
            }
        });

        for (Location location : list) {
            sb.append(location.x).append(" ").append(location.y).append("\n");
        }

        return sb.toString();
    }
}
