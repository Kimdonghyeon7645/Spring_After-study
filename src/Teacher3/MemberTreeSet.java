package Teacher3;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		// Comparator�� �����ϴ� ��� �Ű������� compare()�� ���ǵǾ� �ִ� ��ü�� ����Ʈ ������ �־��־�� ��.
		// treeSet = new TreeSet<Member>(new Member());
		treeSet = new TreeSet<Member>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while( ir.hasNext()) {
			Member member = ir.next();
			if( member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}