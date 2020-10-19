package Lesson3;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("잘 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("꽁꽁 점프!");
    }

    @Override
    public void turn() {
        System.out.println("회전 못해요;;");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("__중급자 레벨 입니다__");
    }
}
