package Lesson1;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.showDate();

        MyDate m = date.getSelf();

        MyDate date2 = new MyDate();
        date2.setDay(30);
        date2.showDate();
    }
}
