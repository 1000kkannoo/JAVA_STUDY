import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Q_2109 {
    static class Lecture implements Comparable<Lecture> {
        private final int money;
        private final int day;

        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        public int getMoney() {
            return money;
        }

        public int getDay() {
            return day;
        }

        @Override
        public int compareTo(Lecture o) {
            return this.day - o.day;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Lecture[] arr = new Lecture[n];

        for (int i = 0; i < arr.length; i++) {
            String[] split = br.readLine().split(" ");
            int money = Integer.parseInt(split[0]);
            int day = Integer.parseInt(split[1]);
            arr[i] = new Lecture(money, day);
        }

        Arrays.sort(arr);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Lecture lecture : arr) {
            pq.add(lecture.getMoney());
            if (pq.size() > lecture.getDay()) pq.poll();
        }

        long sum = 0;
        while (!pq.isEmpty()) sum += pq.poll();

        System.out.println(sum);
    }
}
