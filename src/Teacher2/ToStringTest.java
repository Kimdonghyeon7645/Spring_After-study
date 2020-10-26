package Teacher2;

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException{

		soonrok1 a = new soonrok1(5, "Dog");
		soonrok2 b = new soonrok2(3, "Cat");
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(b.toString());
		
		String str = new String("Rabbit"); //String�� toString()�޼ҵ尡 ��ü�������̵� �Ǿ� ����
		System.out.println(str);
		
		soonrok1 soon1 = new soonrok1(10, "tiger");
		System.out.println(soon1);
		soonrok1 soon11 = (soonrok1) soon1.clone(); // clone()�޼ҵ�� object��ü ��ȯ-> �ٿ�ĳ���� �ʿ�
		System.out.println(soon11);
	}
}

class soonrok1 implements Cloneable {
	private int SIZE;
	private String NAME;
	soonrok1(int size, String name){
		SIZE = size;
		NAME = name;
	}
	public String toString(){ // toString()�޼ҵ� ������

		return "Size is " + SIZE + "\tName is " + NAME;

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class soonrok2{
	private int SIZE;
	private String NAME;
	soonrok2(int size, String name){
		SIZE = size;
		NAME = name;
	}
}
