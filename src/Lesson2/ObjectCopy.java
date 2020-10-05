package Lesson2;

public class ObjectCopy {
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

        System.arraycopy(library, 0, copyLibrary, 0, 5);    // 얕은 복사

        copyLibrary[1].setTitle("도덕경");
        copyLibrary[1].setAuthor("노자");

        System.out.println("- 원본 -");
        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("- 복사본 -");
        for (Book book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
