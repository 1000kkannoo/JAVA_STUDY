## 미션 - 로또

### 🚀 구현할 기능 정리

---
## Model
- [x] createLottoList() : 로또를 발급하는 프로세스
- [x] verifyLottoResult() : 발급된 로또마다 몇개 일치하는지 확인하는 프로세스 

## View
- [x] inputPurchasePrice() : 구매 금액 입력 및 단위 변환
- [x] purchaseResult() : 구매 개수 및 발급된 복권 리스트 출력
- [x] inputWinningNumbers() : 당첨번호 입력 및 List 형변환
- [x] inputBonusNumber() : 보너스번호 입력
- [x] lottoResult() : 로또 결과를 출력 (ENUM 이용)


- [x] validateInputPurchasePrice() : 구매 금액이 1000 단위인지 검증
- [x] validateInputWinningNumbers : 당첨번호 입력시 예외처리
  - [x] 당첨 번호가 총 6개인지 검증
- [x] checkLottoNumberRange() : 각각의 번호가 1 ~ 45 범위에 포함되어있는지 검증

## Controller
- [x] run() : 로또 구매를 시작하는 메서드 구현

