package siberteam.takushinov;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class Card {
    private final char value;
    private final char suit;

    public Card(String cardString) {
        value = cardString.charAt(0);
        suit = cardString.charAt(1);
    }
}
