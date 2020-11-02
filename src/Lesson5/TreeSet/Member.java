package Lesson5.TreeSet;

import java.util.Objects;

// public class Member implements Comparator<Member>{
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
    public String getMemberName() {
        return memberName;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public int compareTo(Member o) {
        return this.memberName.compareTo(o.getMemberName());
    }
}
