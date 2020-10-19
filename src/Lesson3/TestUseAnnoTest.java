package Lesson3;

import java.lang.reflect.Method;

public class TestUseAnnoTest {
    public static void main(String[] args) {
        TestUseAnno tua = new TestUseAnno();
        try {
            System.out.println(tua.getClass());

            // 리플렉션(Reflection) : 런타임에 클래스의 메타 정보를 얻는 기능
//            Method m = tua.getClass().getDeclaredMethod("UseAnno");
            Method m = tua.getClass().getDeclaredMethod("NotUseAnno");
            System.out.println(m);
            if(m.isAnnotationPresent(TestAnno.class)){  // TesAnno 라는 어노테이션에 속해있는 메소드인가?
                tua.UseAnno();
            }
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
