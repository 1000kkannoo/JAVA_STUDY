package week4.view;

public class OutputView {

    public void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    public void printMap() {
    }

    public void printResult() {
    }

    public void printResultMessage(Boolean clear, Integer totalPlay) {
        String message = "";

        if (clear) {
            message = "성공";
        } else {
            message = "실패";
        }

        System.out.printf("게임 성공 여부: %s\n", message);
        System.out.printf("총 시도한 횟수: %s\n", totalPlay);
    }

}
