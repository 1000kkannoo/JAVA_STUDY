package ch09;


public class MemberHashMapTest {

    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1003,"이순신");
        Member memberKim = new Member(1001,"김유신");
        Member memberKang = new Member(1002,"강감찬");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberKim);
        memberHashMap.showAllMembers();

        System.out.println("---------------");
        memberHashMap.removeMemver(1003);
        memberHashMap.showAllMembers();
    }

}
