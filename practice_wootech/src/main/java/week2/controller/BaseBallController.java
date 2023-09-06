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

            while (true) {
                Number myNumber = baseBallView.inputMyNumber();

                Integer strike = computerNumber.checkStrike(myNumber);
                Integer boll = computerNumber.checkBoll(myNumber);

                boolean result = baseBallView.adviceResult(strike, boll);

                if (result) {
                    break;
                }
            }

        } while (baseBallView.isContinue() != false);
    }

}
