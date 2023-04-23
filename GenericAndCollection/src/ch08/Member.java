package ch08;

public class Member implements Comparable<Member> {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj instanceof Member) {
        Member member = (Member) obj;
        if (this.memberId == member.getMemberId()){
            return true;
        }
    }
    return false;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

    @Override
    public int compareTo(Member member) {
        // 오름차순 (양수로 반환)
        // return this.memberId - member.getMemberId();
        // 내림차순 (음수로 반환)
        // return (this.memberId - member.getMemberId()) * (-1);
        // 이름으로 순서 (오름차순)
        // return this.memberName.compareTo(member.getMemberName());
        // 이름으로 순서 (내림차순)
        return (this.memberName.compareTo(member.getMemberName())) * (-1) ;
    }
}
