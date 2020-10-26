package Lesson4;

/*
* 인터페이스를 사용하는 깔끔한 이유 : 클래스 간에 느슨한 결합(Loose Coupling)관계를 만들기 위해서
*
* 강한 결합을 이루고 있는 객체 관계의 특징
- 결합이 되어있지 않으면 사용하지 못한다.
- 결합된 대상의 사용 법이 다르다.( 메서드명이 같으면 매개변수가 다를 것이다.. because 오버 로딩 )
*
*
* */
public class DBUser1 {
    public static void main(String[] args) {
// 강한 결합일 경우
//        Oracle user = new Oracle();
//        user.connection();
//        user.runTransaction();
//        user.commit();
//
//        DB2 user2 = new DB2();
//        user2.login();
//        user2.runTransaction();
//        user2.save();

        // 느슨한 결합일 경우
        DB user = new Oracle();
        user.connection();
        user.runTransaction();
        user.commit();
    }
}
