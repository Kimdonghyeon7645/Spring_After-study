package Lesson1;

public class Array {
    public static void main(String[] args) {
        char[] charList = new char[26];
        for(int i = 'A'; i <= 'Z'; i++) {
            charList[i - 'A'] = (char)i;
        }

        for(char ch : charList) {
            System.out.println(ch + "," + (int)ch);
        }
    }
}

// print(*[i+','+str(ord(i)) for i in range(chr(65), chr(90)+1)], sep='\n')