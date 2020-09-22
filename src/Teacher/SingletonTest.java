package Teacher;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonTest st = new SingletonTest();
		st.methodX();
		st.methodY();
		st.methodZ();
	}
	
	public void methodX() {
		Singleton s = Singleton.getInStance();
		int count = s.getNextInt();
		System.out.println("�޼ҵ� X ȣ�� �� " + count);
	}
	public void methodY() {
		Singleton s = Singleton.getInStance();
		int count = s.getNextInt();
		System.out.println("�޼ҵ� Y ȣ�� �� " + count);
	}
	public void methodZ() {
		Singleton s = Singleton.getInStance();
		int count = s.getNextInt();
		System.out.println("�޼ҵ� Z ȣ�� �� " + count);
	}
}
