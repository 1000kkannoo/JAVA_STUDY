package main.study.setion6_SortingAndSearching;

import java.util.Scanner;

class Location implements Comparable<Location> {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
     * Comparable 을 이용해 compareTo 메서드를 오버라이드해 사용하는 경우
     * ArrayList 인 경우만 가능하다.
     */
    @Override
    public int compareTo(Location o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Q7_좌표_정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Location[] locations = new Location[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            locations[i] = new Location(x, y);
        }

        for (Location location : solution(n, locations)) {
            System.out.println(location.x + " " + location.y);
        }
    }

    private static Location[] solution(int n, Location[] locations) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (locations[j].x > locations[j + 1].x) {
                    Location temp = locations[j];
                    locations[j] = locations[j + 1];
                    locations[j + 1] = temp;
                } else if (locations[j].x == locations[j + 1].x) {
                    if (locations[j].y > locations[j + 1].y) {
                        Location temp = locations[j];
                        locations[j] = locations[j + 1];
                        locations[j + 1] = temp;
                    }
                }
            }
        }
        return locations;
    }
}
