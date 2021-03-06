package Teacher2;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //equals() 메서드 오버라이딩
		if( obj instanceof Student) {
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum );	// 원래 메서드 정의
			return this.studentNum == std.studentNum && this.studentName == std.studentName ;	// 새로 재정의 (오버라이딩)
		}
		return false;
	}

	@Override
	public int hashCode() {		// HashSet, HashMap, Hashtable 타입은 이렇게 hashCode() 메소드도 재정의 (오버라이딩) 해야함
		return studentNum;
	}

}

public class EqualsTest {

	public static void main(String[] args) {

		/*
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "Shin");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
		*/

		Student L1 = new Student(100, "Lee");
		Student L2 = new Student(100, "Lee");
		Student L3 = new Student(100, "Kee");
		System.out.println("L1==L2 : " + (L1==L2));
		System.out.println("L1.equals(L2) : " + L1.equals(L2));
		System.out.println("L1.equals(L3) : " + L1.equals(L3));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i1.equals(i2) : " + i1.equals(i2));
		System.out.println("i1.hashCode() : " + i1.hashCode());
		System.out.println("i2.hashCode() : " + i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));// 물리적인 메모리 주소
		System.out.println(System.identityHashCode(i2));

	}

}