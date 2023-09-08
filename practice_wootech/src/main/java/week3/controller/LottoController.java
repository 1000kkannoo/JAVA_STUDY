package week3.controller;

import week3.model.Lotto;
import week3.service.LottoService;
import week3.view.LottoView;

import java.util.List;
import java.util.Map;

public class LottoController {
    private final LottoService lottoService = new LottoService();
    private final LottoView lottoView = new LottoView(System.in);

    public void run() {
        // 구매금액 입력
        Integer price = lottoView.inputPurchasePrice();
        System.out.println();

        // 구매한 개수 및 로또번호 리스트 출력
        List<Lotto> lottoList = Lotto.createLottoList(price);
        lottoView.purchaseResult(lottoList);
        System.out.println();

        // 로또 당첨 번호 입력
        List<Integer> winningNumbers = lottoView.inputWinningNumbers();
        System.out.println();

        // 로또 보너스 번호 입력
        Integer bonusNumber = lottoView.inputBonusNumber();
        System.out.println();

        // 로또 당첨 확인 및 수익률 계산
        Map<Integer, Integer> result = lottoService.verifyLottoResult(lottoList, winningNumbers, bonusNumber);
        Double rate = lottoService.calculateProfitRate(result, price);

        // 로또 당첨 통계 출력
        lottoView.lottoResult(result, rate);
    }
}
