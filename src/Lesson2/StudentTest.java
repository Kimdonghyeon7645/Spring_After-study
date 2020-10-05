package Lesson2;

public class StudentTest {
    public static void main(String[] args) {

        Student studentDong = new Student(2403, "김동현");
        studentDong.addSubject("국어", 91);
        studentDong.addSubject("수학", 94);

        Student studentDae = new Student(2401, "김대웅");
        studentDae.addSubject("국어", 100);
        studentDae.addSubject("수학", 96);
        studentDae.addSubject("영어", 100);

        studentDong.showStudentInfo();
        System.out.println('\n');
        studentDae.showStudentInfo();
    }
}
