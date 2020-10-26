package Lesson4;

public class Oracle implements DB {
    public void connection() {
        System.out.println("오라클에 접속");
    }
    public void runTransaction() {
        System.out.println("오라클 사용");
    }
    public void commit() {
        System.out.println("오라클 저장");
    }
}
