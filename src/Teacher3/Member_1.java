package Teacher3;

//public class Member implements Comparator<Member>{
public class Member_1 implements Comparable<Teacher3.Member_1>{
	private int memberId;
	private String memberName;
	
	public Member_1() {}
	public Member_1(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "의 멤버이며, " + memberId + "번 입니다!";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Teacher3.Member_1) {
			Teacher3.Member_1 member = (Teacher3.Member_1)obj;
			return (this.memberId == member.memberId); 
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Teacher3.Member_1 member) {//���Ŀ� ���� �޼ҵ� �����ؾ� ��
		
		return this.memberName.compareTo(member.getMemberName());
	}


//	@Override
//	public int compare(Member member1, Member member2) {
//
//		return (member1.memberId - member2.memberId); //����̸� ��������
//	}
//	
	

	
}