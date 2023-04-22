package ch04;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer() {

        // 넣어주지 않아도 컴파일 상에서 알아서 super()를 호출해 상위 클래스의 인스턴스를 생성함
        // super();
        // 상위클래스에 기본생성자가 없다면 아래와 같이 명시적으로 호출하게끔 만들어줘야함.
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
    }
}
