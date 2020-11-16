package Teacher3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		//ArrayList<String> set = new ArrayList<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���"); //�ȵ�, String���� �̹� equals�޼ҵ忡�� ���ǵǾ� ����
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		
	}

}