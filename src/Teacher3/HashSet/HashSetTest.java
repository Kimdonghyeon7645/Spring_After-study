package Teacher3.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		//ArrayList<String> set = new ArrayList<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신"); //안들어감, String에서 이미 equals메소드에서 정의되어 있음
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		
	}

}