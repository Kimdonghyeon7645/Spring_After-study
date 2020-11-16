package Teacher3;

import Teacher3.HashSet.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Teacher3.Member_1 memberLee = new Teacher3.Member_1(300, "Lee");
		Teacher3.Member_1 memberKim = new Teacher3.Member_1(100, "Kim");
		Teacher3.Member_1 memberPark = new Member_1(200, "Park");
	
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
		
	}

}