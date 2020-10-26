package Lesson4;

public class DB2 implements DB {
    public void connection() {
        System.out.println("DB2에 접속");
    }
    public void runTransaction() {
        System.out.println("DB2 사용");
    }
    public void commit() {
        System.out.println("DB2 저장");
    }
}
