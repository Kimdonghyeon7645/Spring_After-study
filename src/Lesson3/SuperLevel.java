package Lesson3;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("씽씽 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("우주까지 점프!");
    }

    @Override
    public void turn() {
        System.out.println("회전도 잘 돌아요!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("__고급자 레벨 입니다__");
    }
}
