package week3.model;

public enum LottoMatchUtils {
    MATCH_3_PRIZE(3, 5000),
    MATCH_4_PRIZE(4, 50000),
    MATCH_5_PRIZE(5, 1500000),
    MATCH_5_BONUS_PRIZE(0, 30000000),
    MATCH_6_PRIZE(6, 2000000000);

    private final int count;
    private final int money;

    LottoMatchUtils(int count, int money) {
        this.count = count;
        this.money = money;
    }

    public static int calculatePrize(int count) {
        for (LottoMatchUtils prize : values()) {
            if (prize.count == count) {
                return prize.money;
            }
        }
        return -1;
    }
}
