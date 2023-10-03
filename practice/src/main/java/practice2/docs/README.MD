# 온라인 음식 주문 시스템 구현

## 주 목표
사용자가 원하는 음식을 온라인으로 주문할 수 있고 주문 내역을 확인 할 수 있는 시스템이다.

### 시스템 구현 사항
음식 메뉴는 음식 이름, 가격, 카테고리, 재고 수량을 포함합니다.
음식 메뉴를 추가, 수정, 삭제, 조회할 수 있어야 합니다.

1. 음식 메뉴는 음식 이름, 가격, 카테고리, 재고 수량을 포함합니다.
2. 음식 메뉴를 조회할 수 있어야합니다.
3. 사용자는 원하는 음식을 주문할 수 있어야 합니다.
4. 주문 시, 해당 음식의 재고 수량이 감소해야 합니다.
5. 주문 정보는 주문한 음식, 수량, 주문 시간, 총 가격, 주문 상태를 포함합니다.
6. 주문 정보를 조회, 수정할 수 있어야 합니다.
7. 사용자는 음식 이름, 카테고리로 음식을 검색할 수 있어야 합니다.

### 기타 요구사항
1. 모든 클래스와 메서드에는 기능을 설명하는 주석을 작성해야 합니다.
2. 복잡한 로직이 포함된 코드 블록에는 작동 방식을 설명하는 주석을 작성해야 합니다.
3. 주요 기능별로 단위 테스트를 작성하고, 모든 테스트가 통과하는지 확인합니다.

## MVC 주요 기능 정리

### MODEL
- User
- Menu
- Order
---
- [ ] readMenuList() - 메뉴 리스트 조회
- [ ] readDetailMenu() - 메뉴 세부 조회
- [ ] saveOrder() - 음식 주문 및 해당 음식 재고 수량 감소
- [ ] readMyOrderList() - 내 주문 내역 리스트 조회
- [ ] readDetailOrder() - 내 주문 내역 상세 조회 
- [ ] searchMenuName() - 음식 이름 검색 조회
- [ ] searchCategory() - 카테고리 음식 조회

### View
Input
- [x] inputSelectAction() - 수행할 액션 넘버 입력
- [x] inputSelectMenuNumber() - 세부 조회할 메뉴 번호 입력
- [x] inputOrderNumber() - 주문할 음식의 번호 입력
- [x] inputReadOrderNumber() - 상세 조회할 주문 번호 입력
- [x] inputSearchMenuName() - 검색할 음식 이름 입력
- [x] inputSearchCategory() - 검색할 카테고리 입력

Output
- [x] printStartMessage() - 애플리케이션 시작 메시지 출력
- [x] printSelectList() - 수행할 액션 리스트 출력
- [x] printMenuList() - 메뉴 리스트 출력
- [x] printDetailMenu() - 메뉴 세부 출력
- [x] printMyOrderList() - 내 주문 내역 리스트 출력
- [x] printDetailOrder() - 내 주문 내역 상세 출력

### Controller
