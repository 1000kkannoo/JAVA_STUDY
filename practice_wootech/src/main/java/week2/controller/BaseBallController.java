package week2.controller;

import week2.model.Number;
import week2.service.BaseBallService;
import week2.view.BaseBallView;

public class BaseBallController {
    private final BaseBallService baseBallService;
    private final BaseBallView baseBallView;

    public BaseBallController(BaseBallService baseBallService, BaseBallView baseBallView) {
        this.baseBallService = baseBallService;
        this.baseBallView = baseBallView;
    }

    public void play() {
        baseBallView.gameStart();

        do {
            Number computerNumber = Number.createRandNumber();
            playRound(computerNumber);
        } while (baseBallView.isContinue());
    }

    private void playRound(Number computerNumber) {
        while (true) {
            Number myNumber = baseBallView.inputMyNumber();

            Integer strike = baseBallService.countStrike(computerNumber, myNumber);
            Integer boll = baseBallService.countBoll(computerNumber, myNumber);

            boolean isGameComplete = baseBallView.adviceResult(strike, boll);

            if (isGameComplete) {
                break;
            }
        }
    }

}
