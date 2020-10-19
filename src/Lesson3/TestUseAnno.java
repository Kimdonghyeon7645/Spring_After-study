package Lesson3;

public class TestUseAnno {
    @TestAnno
    public void UseAnno() {
        System.out.println("Test Anno 어노테이션이 method에 적용되어 있음");
    }

    public void NotUseAnno() {
        System.out.println("하하");
    }
}
