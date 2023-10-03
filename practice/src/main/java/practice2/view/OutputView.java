package practice2.view;

import practice2.model.Menu;
import practice2.model.Order;

import java.util.List;

public class OutputView {
    public void printStartMessage() {
        System.out.println("==== 안녕하세요! 온라인 주문 시스템에 오신 것을 환영합니다. ==== ");
    }

    public void printSelectList() {
        System.out.println("== 1.주문하기   2.메뉴보기    3.메뉴 상세보기   4.메뉴 검색   ==");
        System.out.println("== 5.카테고리 검색 6.내 주문내역 조회 7.내 상세 주문내역 0.종료 ==");
    }

    public void printMenuList(List<Menu> menuList) {
        StringBuilder sb = new StringBuilder();
        for (Menu menu : menuList) {
            sb.append(menu.getMenuId()).append(". ").append(menu.getName()).append("\n");
        }
        System.out.println(sb);
    }

    public void printDetailMenu(Menu menu) {
        System.out.print("== 메뉴 정보 == \n");
        System.out.printf("메뉴 번호 : %s\n", menu.getMenuId());
        System.out.printf("메뉴 카테고리 : %s\n", menu.getCategory());
        System.out.printf("메뉴 이름 : %s\n", menu.getName());
        System.out.printf("메뉴 가격 : %s\n", menu.getPrice());
        System.out.printf("메뉴 재고 : %s\n", menu.getQuantity());
    }

    public void printMyOrderList(List<Order> orderList) {
        for (Order order : orderList) {
            System.out.printf("  === %s번 주문 ===  \n", order.getOrderId());
            System.out.printf("주문 날짜 : %s\n", order.getCreateAt());
            System.out.printf("주문 합계 : %s\n", order.getSumPrice());
        }
    }
}
