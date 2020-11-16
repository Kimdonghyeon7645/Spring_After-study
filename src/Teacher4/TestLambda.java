package Teacher4;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		// �Լ� �����ΰ� ������ �ٷ� ���ԵǾ� ���
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr); //--->�Ű�����ó�� ���
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	//
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		//���ٽ� ��ü�� �����̵� 
		return s->System.out.println(s + "!!!");
	}
}
