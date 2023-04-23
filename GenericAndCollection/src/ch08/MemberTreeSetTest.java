package ch08;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet memberHashSet = new MemberTreeSet();

        Member memberLee = new Member(1003,"이순신");
        Member memberKim = new Member(1001,"김유신");
        Member memberKang = new Member(1002,"강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKang);
        memberHashSet.addMember(memberKim);
        memberHashSet.showAllMembers();
    }
}
