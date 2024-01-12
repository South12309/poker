package siberteam.takushinov;

import org.junit.Assert;
import org.junit.Test;

public class CheckerCombinationTest {
    @Test
    public void checkFlashRoyal() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS AS JS"));
        Assert.assertEquals(Combination.FLASHROYAL, tsQsKsAsJs);
    }
    @Test
    public void checkStreetFlash() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS 9S JS"));
        Assert.assertEquals(Combination.STREET_FLASH, tsQsKsAsJs);
    }
    @Test
    public void checkKare() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC QH"));
        Assert.assertEquals(Combination.KARE, tsQsKsAsJs);
    }
    @Test
    public void checkFullHouse() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC KH"));
        Assert.assertEquals(Combination.FULL_HOUSE, tsQsKsAsJs);
    }
    @Test
    public void checkFlash() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QS QS QS KS"));
        Assert.assertEquals(Combination.FLASH, tsQsKsAsJs);
    }
    @Test
    public void checkStreet() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KH 9S JD"));
        Assert.assertEquals(Combination.STREET, tsQsKsAsJs);
    }
    @Test
    public void checkSet() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S TD"));
        Assert.assertEquals(Combination.SET, tsQsKsAsJs);
    }
    @Test
    public void checkTwoPairs() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S 9D"));
        Assert.assertEquals(Combination.TWO_PAIRS, tsQsKsAsJs);
    }
    @Test
    public void checkPair() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S 8D"));
        Assert.assertEquals(Combination.PAIR, tsQsKsAsJs);
    }
}