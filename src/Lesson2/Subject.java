package Lesson2;

public class Subject {
    private String subjectName;
    private int subjectScore;

    public Subject(String subjectName, int subjectScore) {
        setSubjectName(subjectName);
        setSubjectScore(subjectScore);
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
