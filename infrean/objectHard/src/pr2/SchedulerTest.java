package pr2;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 선택하세요");

        int ch = System.in.read();

        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'P' || ch == 'p') {
            scheduler = new RoundRobin();
        }
        else {
            System.out.println("지원되지 않는 기능 입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCalltoAgent();
    }
}
