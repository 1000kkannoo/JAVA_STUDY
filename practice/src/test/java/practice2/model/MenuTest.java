package practice2.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MenuTest {
    @DisplayName("메뉴 세부 조회")
    @Test
    void readDetailMenu() {
        // given
        Menu menu1 = Menu.createMenu(1L, "음식1", 12000, "양식", 99);
        Menu menu2 = Menu.createMenu(2L, "음식2", 18000, "양식", 99);
        Menu menu3 = Menu.createMenu(3L, "음식3", 14000, "양식", 99);
        Menu menu4 = Menu.createMenu(4L, "음식4", 13000, "양식", 99);
        Menu menu5 = Menu.createMenu(5L, "음식5", 15000, "양식", 99);
        List<Menu> menus = List.of(menu1, menu2, menu3, menu4, menu5);

        // when
        Menu menu = Menu.readDetailMenu(menus, 3L);

        // then
        assertThat(menu)
                .extracting("menuId","name","price","category","quantity")
                .contains(3L, "음식3", 14000, "양식", 99);
    }
}