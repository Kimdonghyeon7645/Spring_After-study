package Teacher1;

public class Singleton {
	private static Singleton sgt = new Singleton(); //������ ��ü ����
	private int cnt = 0;
	
	private Singleton() {}
	
	public static Singleton getInStance() {
		if( sgt == null) {
			sgt = new Singleton();
		}
		return sgt;
	}
	
	public int getNextInt() {
		return cnt += 1;
	}
	
}
