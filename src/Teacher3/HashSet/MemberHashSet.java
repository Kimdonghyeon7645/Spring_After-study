package Teacher3.HashSet;

import Teacher3.HashSet.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet { // Member�� HashSet���� ����
	
	private HashSet<Teacher3.HashSet.Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Teacher3.HashSet.Member>();
	}

	public void addMember(Teacher3.HashSet.Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Teacher3.HashSet.Member> ir = hashSet.iterator();
		while( ir.hasNext()) {
			Teacher3.HashSet.Member member = ir.next();
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