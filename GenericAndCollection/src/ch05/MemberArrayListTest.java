package ch05;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMembers();
        System.out.println("================");
        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMembers();
    }
}
