package practice2.view;

public class OutputView {
    public void printStartMessage() {
        System.out.println("==== 안녕하세요! 온라인 주문 시스템에 오신 것을 환영합니다. ==== ");
    }

    public void printSelectList() {
        System.out.println("== 1.주문하기   2.메뉴보기    3.메뉴 상세보기   4.메뉴 검색   ==");
        System.out.println("== 5.카테고리 검색 6.내 주문내역 조회 7.내 상세 주문내역 0.종료 ==");
    }
}
