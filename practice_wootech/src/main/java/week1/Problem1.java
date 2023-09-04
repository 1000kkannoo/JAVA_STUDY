package week1;

import java.util.List;

class Player {
    private final String name;
    private final Integer score;

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}

public class Problem1 {

    public static final int MINIMUM = 0;
    public static final int MAXIMUM = 400;

    public static void main(String[] args) {
        System.out.println(solution(List.of(97, 98), List.of(197, 198)));
    }

    private static Integer solution(List<Integer> pobiPage, List<Integer> crongPage) {
        // 포비
        Player pobi = new Player(
                "pobi", resultMax(pobiPage.get(0), pobiPage.get(1))
        );

        // 크롱
        Player crong = new Player(
                "crong", resultMax(crongPage.get(0), crongPage.get(1))
        );

        return checkWinner(pobi, crong);
    }

    // 승자 여부 판단 메서드
    private static Integer checkWinner(Player pobi, Player crong) {
        if (pobi.getScore() > crong.getScore()) {
            return 1;
        } else if (pobi.getScore().equals(crong.getScore())) {
            return 0;
        }
        return 2;
    }

    // 페이지 검증 메서드
    private static void validatePage(Integer leftPage, Integer rightPage) {
        if (leftPage == null || rightPage == null) {
            throw new IllegalArgumentException();
        }

        if (leftPage + 1 != rightPage) {
            throw new IllegalArgumentException();
        }

        if (leftPage <= MINIMUM || rightPage >= MAXIMUM) {
            throw new IllegalArgumentException();
        }
    }

    // 참여자의 페이지 최댓값 구하는 메서드
    private static int resultMax(Integer leftPage, Integer rightPage) {
        try {
            validatePage(leftPage, rightPage);
        } catch (IllegalArgumentException e) {
            System.out.println(-1);
            System.exit(0);
        }

        int leftPageMax = Math.max(plus(leftPage), multiply(leftPage));
        int rightPageMax = Math.max(plus(rightPage), multiply(rightPage));

        return Math.max(leftPageMax, rightPageMax);
    }

    // 각 자리를 더하는 메서드
    private static int plus(Integer page) {
        int sum = 0;
        while (page != 0) {
            sum += page % 10;
            page = page / 10;
        }
        return sum;
    }

    // 각 자리를 곱하는 메서드
    private static int multiply(Integer page) {
        int sum = 1;
        while (page != 0) {
            sum *= page % 10;
            page = page / 10;
        }
        return sum;
    }
}
