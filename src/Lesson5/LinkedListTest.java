package Lesson5;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);
        myList.add(1, "D");

        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);

        for(int i = 0; i < myList.size(); i++) {
            String s = myList.get(i);
            System.out.println(s);
        }

    }
}
