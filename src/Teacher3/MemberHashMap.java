package Teacher3;

import Teacher3.HashSet.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Teacher3.HashSet.Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Teacher3.HashSet.Member>();
	}
	
	public void addMember(Teacher3.HashSet.Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if ( hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ����ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}

		System.out.println();
		
	}
	

}
