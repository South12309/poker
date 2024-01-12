package siberteam.takushinov.card;

import lombok.Getter;

import java.util.Arrays;


@Getter
public class Card {
    private final ValueCard value;
    private final Suit suit;

    public Card(String cardString) {
        this.value = Arrays.stream(ValueCard.values()).filter(x -> x.getCardValue() == cardString.charAt(0)).findFirst().orElseThrow();
        suit = Suit.valueOf(String.valueOf(cardString.charAt(1)));
    }
}
