package ch05;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
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
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId){
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 해당 메소드는 Iterator 로도 출력 가능
    public void showAllMembers() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
    }
}
