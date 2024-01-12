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
    @Test
    public void compareSameCombinationSet() {
        PokerHand pokerHand1 = new PokerHand("KS 9D 9S 2H 9C");
        PokerHand pokerHand2 = new PokerHand("AS 5D 2S 2H 2C");
        Assert.assertEquals(1,pokerHand1.compareTo(pokerHand2));
    }
    @Test
    public void compareSameCombinationFullHouse() {
        PokerHand pokerHand1 = new PokerHand("2S 9D 9S 2H 9C");
        PokerHand pokerHand2 = new PokerHand("5S 5D 2S 2H 2C");
        Assert.assertEquals(1,pokerHand1.compareTo(pokerHand2));
    }
    @Test
    public void compareSameCombinationKare() {
        PokerHand pokerHand1 = new PokerHand("2S 9D 9S 9H 9C");
        PokerHand pokerHand2 = new PokerHand("5S 2D 2S 2H 2C");
        Assert.assertEquals(1,pokerHand1.compareTo(pokerHand2));
    }
}