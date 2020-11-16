package Teacher3;

import Teacher3.HashSet.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Teacher3.HashSet.Member memberPark = new Teacher3.HashSet.Member(300, "Park");
		Teacher3.HashSet.Member memberLee = new Teacher3.HashSet.Member(100, "Lee");
		Teacher3.HashSet.Member memberKim = new Teacher3.HashSet.Member(200, "Kim");
		Teacher3.HashSet.Member memberPark2 = new Member(400, "Park");
				
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
				
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

}