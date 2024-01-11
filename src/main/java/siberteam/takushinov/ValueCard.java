package siberteam.takushinov;

public enum ValueCard {
    TWO('2'),
    THREE('3'),
    FOUR('4'),
    FIVE('5'),
    SIX('6'),
    SEVEN('7'),
    EIGHT('8'),
    NINE('9'),
    TEN('T'),
    JACK('J'),
    QUEEN('Q'),
    KING('K'),
    ACE('A');
    private final char cardValue;

    ValueCard(char cardValue) {
        this.cardValue = cardValue;
    }

    public char getCardValue() {
        return cardValue;
    }
}
