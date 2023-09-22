## 기능 구현 설계

### Model
- OrderManager 클래스 구현
  - [x] field : List< Order > 주문 목록
  - [x] deleteOrder() : productId를 기준으로 해당 List에서 제거
  - [x] readAllOrderPrice() : 전체 주문 총액 조회
  - [x] addOrder() : Order의 List에 새로운 Order 객체를 추가
  
- Order 클래스 구현
  - [x] field : 아이템 이름, 수량, 가격, productId
  - [x] createOrder : 생성자로 대체
  - [x] updateOrder() : Order의 내용을 수정
 
### View
- inputView
  - [x] inputOrder() : 아이템 이름, 수량, 가격, productId 입력
  - [x] inputDeleteOrder() : 삭제할 아이템의 productId 입력
  - [x] inputUpdateOrder() : 수정할 아이템의 productId와 수량, 가격 입력

- outputView
  - [x] printOrderProcess() : 사용자가 선택하여 수행할 기능 목록을 출력  
  - [x] printOrderList() : 현재 주문한 리스트 조회
  - [x] printAllOrderPrice() : 전체 주문 총액 출력

### Controller
- [ ] run() : Model, View 중개자 역할