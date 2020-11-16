package Teacher3;

public class Member_3 {

	private int memberId;
	private String memberName;
	
	public Member_3() {}
	public Member_3(int memberId, String memberName) {
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
	
	
	// memberId�� �ι� ���� �ʵ���hashCode(), equals()�޼ҵ带 ������
	
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) { //equals�޼ҵ� ������, memberId�� ������ �ι� ���� �ʵ���
		
		if (obj instanceof Teacher3.Member_3) {
			Teacher3.Member_3 member = (Teacher3.Member_3)obj;
			return (this.memberId == member.memberId); 
		}
		
		return false;
	}
	
	

	
}