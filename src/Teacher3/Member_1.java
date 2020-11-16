package Teacher3;

//public class Member implements Comparator<Member>{
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
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
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId); 
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Member member) {//���Ŀ� ���� �޼ҵ� �����ؾ� ��
		
		return this.memberName.compareTo(member.getMemberName());
	}
	
//	@Override
//	public int compare(Member member1, Member member2) {
//
//		return (member1.memberId - member2.memberId); //����̸� ��������
//	}
//	
	

	
}