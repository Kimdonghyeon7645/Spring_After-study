package Lesson3;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("점프 못해요;;");
    }

    @Override
    public void turn() {
        System.out.println("회전 못해요;;");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("__초급자 레벨 입니다__");
    }
}
