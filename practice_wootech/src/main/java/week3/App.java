package week3;

import week3.controller.LottoController;
import week3.service.LottoService;
import week3.view.LottoView;

public class App {
    public static void main(String[] args) {
        LottoView lottoView = new LottoView(System.in);
        LottoService lottoService = new LottoService();
        LottoController lottoController = new LottoController(lottoService, lottoView);

        lottoController.run();
    }
}
