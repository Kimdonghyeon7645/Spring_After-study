package Teacher3.HashSet;

import Teacher3.HashSet.Member;
import Teacher3.HashSet.MemberHashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Teacher3.HashSet.Member memberLee = new Teacher3.HashSet.Member(100, "Lee");
		Teacher3.HashSet.Member memberKim = new Teacher3.HashSet.Member(200, "Kim");
		Teacher3.HashSet.Member memberPark = new Teacher3.HashSet.Member(300, "Park");
		Teacher3.HashSet.Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		manager.showAllMember();
		
		
	}

}
