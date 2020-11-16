package Teacher3;

import Teacher3.HashSet.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Teacher3.Member_1> treeSet;
	
	public MemberTreeSet() {
		// Comparator�� �����ϴ� ��� �Ű������� compare()�� ���ǵǾ� �ִ� ��ü�� ����Ʈ ������ �־��־�� ��.
		// treeSet = new TreeSet<Member>(new Member());
		treeSet = new TreeSet<Teacher3.Member_1>();
	}

	public void addMember(Teacher3.Member_1 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Teacher3.Member_1> ir = treeSet.iterator();
		while( ir.hasNext()) {
			Teacher3.Member_1 member = ir.next();
			if( member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "입니다!");
		return false;
	}
	
	public void showAllMember() {
		for(Member_1 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}