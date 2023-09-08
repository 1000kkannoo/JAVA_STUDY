package week3.model;

import java.util.*;

import static week3.model.LottoConstants.*;

public class Lotto {

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static List<Lotto> createLottoList(Integer price) {
        price /= 1000;

        List<Lotto> LottoList = new ArrayList<>();
        while (price --> 0) {
            LottoList.add(createLotto());
        }

        return LottoList;
    }

    public static Lotto createLotto() {
        List<Integer> settingNumbers = new ArrayList<>();
        for (int i = LOTTO_MIN; i <= LOTTO_MAX; i++) {
            settingNumbers.add(i);
        }
        Collections.shuffle(settingNumbers);

        List<Integer> randNumbers = settingNumbers.subList(0, LOTTO_COUNT);
        randNumbers.sort(Comparator.naturalOrder());

        return new Lotto(randNumbers);
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
}
