package ch09;

public class TypeConversion {

    public static void main(String[] args){
        double dNum = 1.2;
        float fNum = 0.9f;

        // 형변환에 따라 계산이 달라진다.
        int iNum1 = (int) dNum + (int) fNum;
        int iNum2 = (int)(dNum + fNum);

        System.out.println(iNum1); // 1
        System.out.println(iNum2); // 2

        int num = 1000;
        byte bNum = (byte) num;

        // 한바이트가 짤리기 때문에 다른 값이 들어감
        System.out.println(bNum); // -24
    }
}
