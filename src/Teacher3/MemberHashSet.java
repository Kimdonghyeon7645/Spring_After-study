package Teacher3;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet { // Member�� HashSet���� ����
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		while( ir.hasNext()) {
			Member member = ir.next();
			if( member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}