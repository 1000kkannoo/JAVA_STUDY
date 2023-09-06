package week2.controller;

import week2.model.Number;
import week2.view.BaseBallView;

public class BaseBallController {
    private final BaseBallView baseBallView;

    public BaseBallController(BaseBallView baseBallView) {
        this.baseBallView = baseBallView;
    }

    public void play() {
        baseBallView.gameStart();

        do {
            Number computerNumber = Number.createRandNumber();
            playRound(computerNumber);
        } while (baseBallView.isContinue() != false);
    }

    private void playRound(Number computerNumber) {
        while (true) {
            Number myNumber = baseBallView.inputMyNumber();

            Integer strike = computerNumber.countStrike(myNumber);
            Integer boll = computerNumber.countBoll(myNumber);

            boolean isGameComplete = baseBallView.adviceResult(strike, boll);

            if (isGameComplete) {
                break;
            }
        }
    }

}
