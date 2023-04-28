package ch01;

public class VIPCustomer extends Customer{
    private static int agentNum = 0;
    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        agentID = ++agentNum;
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
    }

    public Boolean changeAgentId(int agentID) {
        if (agentID == 0) {
            return false;
        }
        this.agentID = agentID;
        return true;
    }

    public void checkMyAgentId(){
        System.out.println(customerName + " 님의 agentID : " + agentID);
    }
}
