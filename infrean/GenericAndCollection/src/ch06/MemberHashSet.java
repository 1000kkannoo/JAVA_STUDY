package ch06;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
/*        for (int i = 0; i < arrayList.size() ; i++) {
            Member member = arrayList.get(i);
            if (member.getMemberId() == memberId) {
                arrayList.remove(i);
                return true;
            }
        }*/

        // Iterator를 통한 순회 (Set에 사용될 수 잇음)
        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 해당 메소드는 Iterator 로도 출력 가능
    public void showAllMembers() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
    }
}
