package Lesson1;

public class Card {
    public int cardNumber;
    private static int serialNumber = 10000;

    public Card() {
        cardNumber = ++serialNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
