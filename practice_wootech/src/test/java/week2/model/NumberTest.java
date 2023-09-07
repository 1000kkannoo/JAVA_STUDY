package week2.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberTest {

    @DisplayName("랜덤으로 각기다른 3자리 숫자를 만들어낸다.")
    @Test
    void createRandNumber() {
        // given

        // when
        Number randNumber = Number.createRandNumber();
        String num = randNumber.getNum();

        // then
        assertThat(num).hasSize(3);  // 3자리 숫자인지 확인
        assertThat(num.chars().distinct().count()).isEqualTo(3);  // 각 숫자마다 전부 다른 숫자인지 확인
    }

}