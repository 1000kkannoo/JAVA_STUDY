package main.level0;

import java.time.LocalDate;

public class 날짜_비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
    }

    public static int solution(int[] date1, int[] date2) {
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);

        if (localDate1.isBefore(localDate2)) {
            return 1;
        }

        return 0;
    }
}
