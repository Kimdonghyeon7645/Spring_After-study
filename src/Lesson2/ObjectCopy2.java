package Lesson2;

public class ObjectCopy2 {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("맹꽁이 서당 1권", "윤승운");
        library[1] = new Book("맹꽁이 서당 2권", "윤승운");
        library[2] = new Book("맹꽁이 서당 3권", "윤승운");
        library[3] = new Book("맹꽁이 서당 4권", "윤승운");
        library[4] = new Book("맹꽁이 서당 5권", "윤승운");

        for (Book book : library) {
            book.showBookInfo();
        }

        // 깊은 복사의 세계로
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("도덕경");
        library[0].setAuthor("노자");

        System.out.println("\n- 원본 -");
        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("\n- 복사본 -");
        for (Book book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
