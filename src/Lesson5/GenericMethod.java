package Lesson5;

class Data{
    public static <T> T showData(T data) {
        if(data instanceof String)
            System.out.println("String");
        else if(data instanceof Integer)
            System.out.println("Integer");
        else if(data instanceof Double)
            System.out.println("Double");
        System.out.println(data);
        return data;
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Data.<String>showData("문자열!");      // 제네릭 메소드 명시적 호출
        Data.showData("문자열!");      // 제네릭 메소드 암묵적 호출
        Data.showData(1);
        Data.showData(1.0);
    }
}
