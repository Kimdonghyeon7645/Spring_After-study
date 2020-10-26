package Lesson4;

public class Plastic extends Meterial {
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    public void doPrinting() {
        System.out.println("Plastic 으로 프린팅 합니다.");
    }
}
