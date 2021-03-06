package Teacher3;

import Teacher3.HashSet.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		Teacher3.HashSet.Member memberLee = new Teacher3.HashSet.Member(100, "Lee");
		Teacher3.HashSet.Member memberKim = new Teacher3.HashSet.Member(200, "Kim");
		Teacher3.HashSet.Member memberPark = new Teacher3.HashSet.Member(300, "Park");
		Teacher3.HashSet.Member memberPark2 = new Member(300, "Park");
				
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
				
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

}
