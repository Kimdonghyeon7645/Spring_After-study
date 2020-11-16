package Teacher3;

import Teacher3.HashSet.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	private TreeMap<Integer, Teacher3.HashSet.Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Teacher3.HashSet.Member>();
	}
	
	public void addMember(Teacher3.HashSet.Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if ( treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ����ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}

		System.out.println();
		
	}
	
}