package Teacher3;

import Teacher3.HashSet.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Teacher3.HashSet.Member> treeSet;
	
	public MemberTreeSet() {
		// Comparator�� �����ϴ� ��� �Ű������� compare()�� ���ǵǾ� �ִ� ��ü�� ����Ʈ ������ �־��־�� ��.
		// treeSet = new TreeSet<Member>(new Member());
		treeSet = new TreeSet<Teacher3.HashSet.Member>();
	}

	public void addMember(Teacher3.HashSet.Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Teacher3.HashSet.Member> ir = treeSet.iterator();
		while( ir.hasNext()) {
			Teacher3.HashSet.Member member = ir.next();
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