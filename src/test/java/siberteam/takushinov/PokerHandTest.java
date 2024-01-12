package siberteam.takushinov;

import org.junit.Assert;
import org.junit.Test;

public class PokerHandTest {

    @Test
    public void compareSameCombinationTwoPairs() {
        PokerHand pokerHand1 = new PokerHand("KS 9D 2S 2H 9C");
        PokerHand pokerHand2 = new PokerHand("8S TD 2S 2H TC");
        Assert.assertEquals(-1,pokerHand1.compareTo(pokerHand2));
    }
    @Test
    public void compareSameCombinationPairs() {
        PokerHand pokerHand1 = new PokerHand("KS 9D 8S 2H 9C");
        PokerHand pokerHand2 = new PokerHand("AS 5D 2S 2H TC");
        Assert.assertEquals(1,pokerHand1.compareTo(pokerHand2));
    }
}