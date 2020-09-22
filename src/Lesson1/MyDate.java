package Lesson1;

public class MyDate {
    private final String myName;
    private int day;
    private int month;
    private int year;

    public boolean isValid = true;

    public MyDate() {
        this("김동현", 28, 2, 2020);
    }

    public MyDate(String myName, int day, int month, int year) {
        this.myName = myName;
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    private static boolean isLeapYear(int day, int month, int year) {
        if(month <= 12) {
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return (0 < day && day <= 31);
                case 4:
                case 6:
                case 9:
                case 11:
                    return (0 < day && day <= 30);
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        return (0 < day && day <= 29);
                    } else {
                        return (0 < day && day <= 28);
                    }
            }
        }
        return false;
    }



    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getMyName() {
        return myName;
    }

    public void setDay(int day) {
        this.day = day;
        isValid = isLeapYear(day, month, year);
    }

    public void setMonth(int month) {
        this.month = month;
        isValid = (0 < month && month < 13);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        System.out.println(myName + "의 탄생일은 " + year + "년 " + month + "월 " + day + "일 입니다.");
        if(!isValid) {
            System.out.println("유효하지 않은 날짜 입니다.");
        }
    }

    public MyDate getSelf() {
        return this;
    }
}
