package Lesson5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");     // 중복은 안 들어감

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
