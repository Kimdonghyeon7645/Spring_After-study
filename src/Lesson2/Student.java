package Lesson2;
import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        this.subjectList.add(new Subject(subjectName, subjectScore));
    }

    public void showStudentInfo() {
        int total = 0;
        int avg = 0;
        System.out.println("<< 학생명 >>: " + studentName);
        for(Subject subject : subjectList) {
            total += subject.getSubjectScore();
            avg = total / subjectList.size();
            System.out.print("과목명 : " + subject.getSubjectName());
            System.out.println("\t점수 : " + subject.getSubjectScore());
        }
        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
    }
}
