package Teacher3;

public class Member_4 {

	private int memberId;
	private String memberName;
	
	public Member_4() {}
	public Member_4(int memberId, String memberName) {
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

	
}