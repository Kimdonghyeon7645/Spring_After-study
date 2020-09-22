package Lesson1;

public class CardCompany {
    private static CardCompany singleton = new CardCompany();
    private CardCompany() {};

    public static CardCompany getInstance() {
        if(singleton == null) {
            singleton = new CardCompany();
        }
        return singleton;
    }

    public Card createCard() {
        return new Card();
    }
}
