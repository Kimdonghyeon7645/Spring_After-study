package Teacher3;

import Teacher3.HashSet.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Teacher3.HashSet.Member memberLee = new Teacher3.HashSet.Member(300, "Lee");
		Teacher3.HashSet.Member memberKim = new Teacher3.HashSet.Member(100, "Kim");
		Teacher3.HashSet.Member memberPark = new Member(200, "Park");
	
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
	
		
		manager.showAllMember();
		
		
	}

}